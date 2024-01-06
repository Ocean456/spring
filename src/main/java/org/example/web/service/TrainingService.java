package org.example.web.service;


import jakarta.annotation.Resource;
import org.example.web.dto.TrainingForm;
import org.example.web.entity.Training;
import org.example.web.mapper.TrainingMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingService {
    @Resource
    private TrainingMapper trainingMapper;


    public List<TrainingForm> getAllTrainings() {
        return trainingMapper.getAllTrainings();
    }

    public Boolean createTraining(Training training) {

        return trainingMapper.insert(training) > 0;
    }

    public Boolean updateTraining(Training training) {
        return trainingMapper.updateById(training) > 0;
    }

    public Boolean deleteTraining(Integer trainingId) {
        return trainingMapper.deleteById(trainingId) > 0;
    }

    public List<TrainingForm> getTraining(String trainingName) {
        return trainingMapper.getTrainByName(trainingName);

    }
}
