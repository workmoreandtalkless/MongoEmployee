package com.example.mongorest.controller;

import com.example.mongorest.domain.Course;
import com.example.mongorest.domain.Employee;
import com.example.mongorest.domain.response.CourseResponse;
import com.example.mongorest.domain.response.EmployeeResponse;
import com.example.mongorest.repository.EmployeeRepository;
import com.example.mongorest.service.CourseService;
import com.example.mongorest.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Guohua Zhang
 * @create 2022-08-15 10:46 AM
 */
@RestController
@Api(value="Employee end point")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @PostMapping("/create")
    @ApiOperation(value = "Creat a Employee",response = Employee.class)
    public EmployeeResponse CreateNewCourse(@RequestBody Employee employee){

        Employee newEmployee = employeeService.insertEmployee(employee);
        return EmployeeResponse.builder()
                .message("Creat Success")
                .employee(newEmployee).build();
    }


}
