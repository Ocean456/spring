package org.example.web.dto;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class TrainingForm {
    @TableId("TrainingId")
    private Integer trainingId;
    @TableField("TrainingName")
    private String trainingName;
    @TableField("EmployeeId")
    private String employeeId;
    @TableField("TrainingStartDate")
    private String trainingStartDate;
    @TableField("TrainingEndDate")
    private String trainingEndDate;
    @TableField("EmployeeName")
    private String employeeName;
}
