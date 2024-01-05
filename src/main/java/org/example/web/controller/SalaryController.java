package org.example.web.controller;


import jakarta.annotation.Resource;
import org.example.web.entity.Salary;
import org.example.web.service.SalaryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SalaryController {

    @Resource
    private SalaryService salaryService;

    @GetMapping("/getsalary")
    public List<Salary> get1(){
        return salaryService.select();
    }

    @GetMapping("/search")
    public List<Salary> search(@RequestParam int id,@RequestParam String month){
        return salaryService.search(id,month);
    }
    @GetMapping("/search1")
    public List<Salary> search1(@RequestParam int id){
        return salaryService.search1(id);
    }
    @GetMapping("/search2")
    public List<Salary> search2(@RequestParam String month){
        return salaryService.search2(month);
    }

}
