package com.mongo.example.mongodbexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.example.mongodbexample.models.Employee;
import com.mongo.example.mongodbexample.rep.EmployeeRepository;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping(value="/")
    public ResponseEntity<?> addEmployees(@RequestBody Employee emp) {
        Employee employee = employeeRepository.save(emp);
        return ResponseEntity.ok(employee);
    }

    @GetMapping(value="/")
    public ResponseEntity<?> getEmployees() {
        return ResponseEntity.ok(employeeRepository.findAll());
    }
    
}
