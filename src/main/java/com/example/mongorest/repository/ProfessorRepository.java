package com.example.mongorest.repository;

import com.example.mongorest.domain.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;
/**
 * @author Guohua Zhang
 * @create 2022-08-08 2:29 AM
 */
public interface ProfessorRepository extends MongoRepository<Course, String> {

    Optional<Course> findByProfessor_FirstName(String s);
}
