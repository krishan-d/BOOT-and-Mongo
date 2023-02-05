package com.mongo.example.mongodbexample.rep;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.example.mongodbexample.models.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer>{
    
    
}
