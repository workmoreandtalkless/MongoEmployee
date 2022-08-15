package com.example.mongorest.repository;

import com.example.mongorest.domain.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;
/**
 * @author Guohua Zhang
 * @create 2022-08-08 2:28 AM
 */
public interface CourseRepository extends MongoRepository<Course, String> {

    Optional<Course> findById(String id);

    Course insert(Course course);

    Course save(Course course);

}
