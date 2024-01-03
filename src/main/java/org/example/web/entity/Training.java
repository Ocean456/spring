package org.example.web.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("training")
public class Training {
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
}
