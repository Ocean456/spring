package org.example.web.controller;


import jakarta.annotation.Resource;
import org.example.web.service.AnalysisService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AnalysisController {
    @Resource
    private AnalysisService analysisService;
    @GetMapping("/count/Gender")
    public String[][]  getGenderEmployeeCount() {
        return analysisService.getGenderEmployeeCount();
    }

    @GetMapping("/count/Department")
    public String[][]  getDepartmentEmployeeCount() {
        return analysisService.getDepartmentEmployeeCount();
    }

    @GetMapping("/count/Age")
    public String[][]  getAgeEmployeeCount() {
        return analysisService.getAgeEmployeeCount();
    }

    @GetMapping("/count/HireDate")
    public String[][]  getHireDateEmployeeCount() {
        return analysisService.getHireDateEmployeeCount();
    }

    @GetMapping("/count/Address")
    public String[][]  getAddressEmployeeCount(){return analysisService.getAddressEmployeeCount();}

}
