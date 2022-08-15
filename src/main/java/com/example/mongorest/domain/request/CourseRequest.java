package com.example.mongorest.domain.request;

import com.example.mongorest.domain.Student;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author Guohua Zhang
 * @create 2022-08-08 2:33 AM
 */
@Getter
@Setter
@ToString
@Builder
public class CourseRequest {
    String name;
    String description;
    String professor_firstname;
    String professor_lastname;
    String department;
    List<Student> students;
}
