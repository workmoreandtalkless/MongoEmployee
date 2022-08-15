package com.example.mongorest.controller;

import com.example.mongorest.domain.Course;
import com.example.mongorest.domain.response.CourseResponse;
import com.example.mongorest.service.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Guohua Zhang
 * @create 2022-08-08 2:26 AM
 */
@RestController
@Api(value="Course end point")

public class CourseController {

    CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService){
        this.courseService = courseService;
    }

    @GetMapping("/course")
    @ApiOperation(value = "Find Course by ID",response = Course.class)
    public Course getCourseById(@RequestParam String id){
        return courseService.findCourseById(id).orElse(null);
    }

    @GetMapping("/professor/")
    @ApiOperation(value = "Find Course by Professor firstname",response = Course.class)
    public Course getCourseByProfessorId(@RequestParam String firstname){
        return courseService.findCouseByProfessorFirstName(firstname).orElse(null);
    }

    @PostMapping("/create")
    @ApiOperation(value = "Creat a Course",response = Course.class)
    public CourseResponse CreateNewCourse(@RequestBody Course course){
        Course targetCourse = courseService.insertCourse(course);
        return CourseResponse.builder().message("Creat Success").course(targetCourse).build();
    }

    @PostMapping ("/update")
    @ApiOperation(value = "Creat a Course",response = Course.class)
    public CourseResponse UpdateCourse(@RequestBody Course course){
        Course targetCourse = courseService.UpdateCourse(course);
        return CourseResponse.builder().message("Update Success").course(targetCourse).build();
    }

}