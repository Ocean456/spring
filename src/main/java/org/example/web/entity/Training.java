package org.example.web.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("training")
public class Training {
    @TableId(value = "TrainingId",type = IdType.AUTO)
    private Integer trainingId;
    @TableField("TrainingName")
    private String trainingName;
    @TableField("EmployeeId")
    private String employeeID;
    @TableField("TrainingStartDate")
    private String trainingStartDate;
    @TableField("TrainingEndDate")
    private String trainingEndDate;
}
