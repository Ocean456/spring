package org.example.web.service;


import jakarta.annotation.Resource;
import org.example.web.entity.Employee;
import org.example.web.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;

    public List<Employee> getAllEmployees() {
        return employeeMapper.selectList(null);
    }

    public Employee createEmployee(Employee employee) {
        employeeMapper.insert(employee);
        return employee;
    }
}
