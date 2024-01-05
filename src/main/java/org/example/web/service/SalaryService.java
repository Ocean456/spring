package org.example.web.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jakarta.annotation.Resource;
import org.example.web.entity.Salary;
import org.example.web.mapper.SalaryMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryService {
    @Resource
    private SalaryMapper salaryMapper;

    public List<Salary> select(){
        return salaryMapper.selectList(null);
    }
    public List<Salary> search(int id,String month){
        QueryWrapper<Salary> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("EmployeeId",id);
        queryWrapper.eq("Month",month);
        return salaryMapper.selectList(queryWrapper);
    }
    public List<Salary> search1(int id){
        QueryWrapper<Salary> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("EmployeeId",id);
        return salaryMapper.selectList(queryWrapper);
    }
    public List<Salary> search2(String month){
        QueryWrapper<Salary> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("Month",month);
        return salaryMapper.selectList(queryWrapper);
    }

}
