package org.example.web.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jakarta.annotation.Resource;
import org.example.web.entity.Application;
import org.example.web.mapper.ApplicationMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {
    @Resource
    private ApplicationMapper applicationMapper;


    public List<Application> getAllApplications() {
        return applicationMapper.selectList(null);
    }

    public Boolean updateApplication(Integer applicationId, Integer applicationStatus) {
        System.out.println(applicationId);
        Application application = applicationMapper.selectOne(new QueryWrapper<Application>().eq("ApplicationID", applicationId));
        application.setApplicationStatus(applicationStatus);
        return applicationMapper.updateById(application) == 1;
    }


    public void insertApplication(Application application) {
        application.setApplicationStatus(0);
        applicationMapper.insert(application);

    }

    public ApplicationService(ApplicationMapper applicationMapper) {
        this.applicationMapper = applicationMapper;
    }

    public int count_Application() {
        return applicationMapper.countApplication();
    }

    public int status(String id) {
        QueryWrapper<Application> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("EmployeeID", id);
        return applicationMapper.selectOne(queryWrapper).getApplicationStatus();
    }

    public Boolean deleteApplication(String applicationId) {
        return applicationMapper.deleteById(applicationId) > 0;
    }
}
