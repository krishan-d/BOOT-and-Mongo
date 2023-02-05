package com.mongo.example.mongodbexample.models;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "Employees")
@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@ToString(includeFieldNames = true)
@Builder
public class Employee {
    
    private int emp_id;
    private String name;
    private String department;
    private double salary;
    private String sex;

}
