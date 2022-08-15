package com.example.mongorest.service;

import com.example.mongorest.domain.Course;
import com.example.mongorest.repository.CourseRepository;
import com.example.mongorest.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
/**
 * @author Guohua Zhang
 * @create 2022-08-08 2:27 AM
 */
@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    ProfessorRepository professorRepository;

    public Optional<Course> findCourseById(String id){
        return courseRepository.findById(id);
    }
    public Optional<Course> findCouseByProfessorFirstName(String s){
        return professorRepository.findByProfessor_FirstName(s);
    }

    public Course insertCourse(Course course){
        return courseRepository.insert(course);
    }

    public Course UpdateCourse(Course course){
        return courseRepository.save(course);
    }


}
