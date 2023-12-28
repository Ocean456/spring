package org.example.web.entity;


import lombok.Data;

@Data
public class Employee {
    private Integer employeeID;
    private String employeeName;
    private String employeeGender;
    private Integer employeeAge;
    private String employeePhone;
    private String employeeAddress;
    private String employeeDepartment;
    private String employeePosition;
    private Double employeeSalary;
    private String employeeHireDate;
    private String employeeResignationDate;
    private String employeeEmergencyContactPhone;
    private String employeeDormitory;
}
