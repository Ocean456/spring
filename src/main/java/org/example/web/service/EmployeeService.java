package org.example.web.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jakarta.annotation.Resource;
import org.example.web.entity.Account;
import org.example.web.entity.Employee;
import org.example.web.entity.Role;
import org.example.web.mapper.AccountMapper;
import org.example.web.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;

    @Resource
    private AccountMapper accountMapper;

    public List<Employee> getAllEmployees() {
        return employeeMapper.selectList(null);
    }

    public IPage<Employee> getEmployeePage(int page, int size) {
        Page<Employee> employeePage = new Page<>(page, size);
        return employeeMapper.selectPage(employeePage, null);
    }

    public Boolean createEmployee(Employee employee) {

        Account account = new Account(null, null, "000000", Role.USER);
        account.setUsername(employee.getEmployeePhone());
        return employeeMapper.insert(employee) > 0 && accountMapper.insert(account) > 0;
    }

    public Employee updateEmployee(Employee employee) {
        employeeMapper.updateById(employee);
        return employee;
    }


    public List<Employee> getEmployee(String type, String parameter) {
        QueryWrapper<Employee> queryWrapper = new QueryWrapper<>();
        queryWrapper.like(type, parameter);
        return employeeMapper.selectList(queryWrapper);
    }

    public Boolean deleteEmployee(Integer employeeId) {
        return employeeMapper.deleteById(employeeId) > 0;
    }

    public Integer getEmployeeCount() {
        return Math.toIntExact(employeeMapper.selectCount(null));
    }


    public String getdormiyoryNumber(String id){
        Employee employee=employeeMapper.selectById(id);
        return employee.getEmployeeDormitory();
    }
    public Integer getId(String username){
        QueryWrapper<Employee> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("EmployeePhone",username);
        return employeeMapper.selectOne(queryWrapper).getEmployeeID();
    }


    public String getName(String id){
        Employee employee=employeeMapper.selectById(id);
        return employee.getEmployeeName();
    }

    public Employee select_info(String username){
        QueryWrapper<Employee> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("EmployeePhone",username);
        return employeeMapper.selectOne(queryWrapper);
    }

    public void update_employee(String id,String address,String hiretime,String Ephone){
        Employee employee=employeeMapper.selectById(id);
        employee.setEmployeeAddress(address);
        employee.setEmployeeHireDate(hiretime);
        employee.setEmployeeEmergencyContactPhone(Ephone);
        employeeMapper.updateById(employee);
    }
}
