package org.example.web.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("attendance")
public class Attendance {
    @TableId("AttendanceId")
    private Integer attendanceId;
    @TableField("EmployeeId")
    private Integer employeeId;
    @TableField("AttendanceDate")
    private String attendanceDate;
    @TableField("AttendanceStatus")
    private String attendanceStatus;
    @TableField("AttendanceTime")
    private String attendanceTime;

}
