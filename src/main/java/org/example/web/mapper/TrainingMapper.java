package org.example.web.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.web.dto.TrainingForm;
import org.example.web.entity.Training;

import java.util.List;

@Mapper
public interface TrainingMapper extends BaseMapper<Training> {
    @Select("select training. *,EmployeeName from training join employee on employee.EmployeeID = training.EmployeeID ")
    List<TrainingForm> getAllTrainings();

    @Select("select training. *,EmployeeName from training join employee on employee.EmployeeID = training.EmployeeID where trainingName like CONCAT('%',#{trainingName},'%')")
    List<TrainingForm> getTrainByName(String trainingName);
}
