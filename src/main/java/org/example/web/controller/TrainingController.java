package org.example.web.controller;


import jakarta.annotation.Resource;
import org.example.web.service.TrainingService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainingController {
    @Resource
    private TrainingService trainingService;
}
