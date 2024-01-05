package org.example.web.controller;


import jakarta.annotation.Resource;
import org.example.web.entity.Employee;
import org.example.web.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class EmployeeController {


    @Resource
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public ResponseEntity<?> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @GetMapping("/employees/count")
    public ResponseEntity<?> getEmployeeCount() {
        return ResponseEntity.ok(employeeService.getEmployeeCount());
    }

    @GetMapping("/employees/page")
    public ResponseEntity<?> getEmployeePage(@RequestParam int page,@RequestParam int size) {
        return ResponseEntity.ok(employeeService.getEmployeePage(page,size));
    }

    @GetMapping("/employee")
    public ResponseEntity<?> getEmployee(@RequestParam String type,@RequestParam String parameter) {
        return ResponseEntity.ok(employeeService.getEmployee(type,parameter));
    }

    @PostMapping("/employee")
    public ResponseEntity<?> createEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.createEmployee(employee));
    }

    @PutMapping("/employee")
    public ResponseEntity<?> updateEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.updateEmployee(employee));
    }

    @DeleteMapping("/employee")
    public ResponseEntity<?> deleteEmployee(@RequestParam Integer employeeId) {
        return ResponseEntity.ok(employeeService.deleteEmployee(employeeId));
    }

    @GetMapping("/getNumber")
    public String get_dormitory(String id){
        return employeeService.getdormiyoryNumber(id);
    }
    @GetMapping("/getid")
    public Integer get_id(String username){
        return employeeService.getId(username);
    }

    @GetMapping("/getname")
    public String get_name(String id){
        return employeeService.getName(id);
    }

    @GetMapping("/phone")
    public Employee getinfo(String username){
        return employeeService.select_info(username);
    }


    @PutMapping("/perfect")
    public void perfect_info(@RequestBody Map<String,String> requestInfo){
        String id = requestInfo.get("id");
        String address=requestInfo.get("address");
        String time=requestInfo.get("time");
        String phone=requestInfo.get("phone");
        employeeService.update_employee(id,address,time,phone) ;
    }
}
