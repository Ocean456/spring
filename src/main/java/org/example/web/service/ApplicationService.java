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
}
