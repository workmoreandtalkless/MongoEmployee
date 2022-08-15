package com.example.mongorest.repository;

import com.example.mongorest.domain.Course;
import com.example.mongorest.domain.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

/**
 * @author Guohua Zhang
 * @create 2022-08-15 10:22 AM
 */
public interface EmployeeRepository extends MongoRepository<Employee, String> {
    Optional<Employee> findById(String id);

    Employee insert(Employee employee);

    Employee save(Employee employee);
}
