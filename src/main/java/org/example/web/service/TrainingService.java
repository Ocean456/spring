package org.example.web.service;


import jakarta.annotation.Resource;
import org.example.web.mapper.TrainingMapper;
import org.springframework.stereotype.Service;

@Service
public class TrainingService {
    @Resource
    private TrainingMapper trainingMapper;


}
