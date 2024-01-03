package org.example.web.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * create table salary
 * (
 * SalaryId     int         not null
 * primary key,
 * EmployeeId   int         not null,
 * EmployeeName varchar(50) not null,
 * BasicSalary  int         not null,
 * Allowance    int         not null,
 * Deduction    int         not null,
 * TotalSalary  int         not null,
 * Month        varchar(50) not null
 * );
 */

@Data
@TableName("salary")
public class Salary {
    @TableId("SalaryId")
    private Integer salaryId;
    @TableField("EmployeeId")
    private Integer employeeId;
    @TableField("EmployeeName")
    private String employeeName;
    @TableField("BasicSalary")
    private Integer basicSalary;
    @TableField("Allowance")
    private Integer allowance;
    @TableField("Deduction")
    private Integer deduction;
    @TableField("TotalSalary")
    private Integer totalSalary;
    @TableField("Month")
    private String month;
}
