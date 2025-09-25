package com.example.mongodbTask.repository;

import com.example.mongodbTask.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
