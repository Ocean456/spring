package org.example.web.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("attendance")
public class Attendance {
    @TableId(value = "AttendanceId", type = IdType.AUTO)
    private Integer attendanceId;
    @TableField("EmployeeId")
    private Integer employeeId;
    @TableField("AttendanceDate")
    private Date attendanceDate;
    @TableField("AttendanceStatus")
    private String attendanceStatus;
    @TableField("AttendanceTime")
    private Date attendanceTime;

}
