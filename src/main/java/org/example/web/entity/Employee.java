package org.example.web.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("employee")
public class Employee {
    @TableId("EmployeeID")
    private Integer employeeID;
    @TableField("EmployeeName")
    private String employeeName;
    @TableField("EmployeeGender")
    private String employeeGender;
    @TableField("EmployeeAge")
    private Integer employeeAge;
    @TableField("EmployeePhone")
    private String employeePhone;
    @TableField("EmployeeAddress")
    private String employeeAddress;
    @TableField("EmployeeDepartment")
    private String employeeDepartment;
    @TableField("EmployeePosition")
    private String employeePosition;
    @TableField("EmployeeSalary")
    private Double employeeSalary;
    @TableField("EmployeeHireDate")
    private String employeeHireDate;
    @TableField("EmployeeResignationDate")
    private String employeeResignationDate;
    @TableField("EmployeeEmergencyContactPhone")
    private String employeeEmergencyContactPhone;
    @TableField("EmployeeDormitory")
    private String employeeDormitory;
}
