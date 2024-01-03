package org.example.web.controller;


import jakarta.annotation.Resource;
import org.example.web.entity.Training;
import org.example.web.service.TrainingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TrainingController {
    @Resource
    private TrainingService trainingService;

    @GetMapping("/trainings")
    public ResponseEntity<?> getAllTrainings() {
        return ResponseEntity.ok(trainingService.getAllTrainings());
    }

    @PostMapping("/training")
    public ResponseEntity<?> createTraining(@RequestBody Training training) {
        return ResponseEntity.ok(trainingService.createTraining(training));
    }

    @PutMapping("/training")
    public ResponseEntity<?> updateTraining(@RequestBody Training training) {
        return ResponseEntity.ok(trainingService.updateTraining(training));
    }

    @DeleteMapping("/training")
    public ResponseEntity<?> deleteTraining(@RequestParam Integer trainingId) {
        return ResponseEntity.ok(trainingService.deleteTraining(trainingId));
    }
}
