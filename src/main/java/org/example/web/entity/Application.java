package org.example.web.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("application")
public class Application {
    @TableId("ApplicationId")
    private Integer applicationId;
    @TableField("EmployeeId")
    private Integer employeeId;
    @TableField("EmployeeName")
    private String employeeName;
    @TableField("FormerDormitory")
    private String formerDormitory;
    @TableField("NewDormitory")
    private String newDormitory;
    @TableField("ApplicationTime")
    private String applicationTime;
    @TableField("ApplicationStatus")
    private Integer applicationStatus;
}
