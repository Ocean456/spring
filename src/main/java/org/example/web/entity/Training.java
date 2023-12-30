package org.example.web.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("training")
public class Training {
    private Integer TrainingId;
    private String TrainingName;
    private String EmployeeId;
    private String TrainingStartTime;
    private String TrainingEndTime;
}
