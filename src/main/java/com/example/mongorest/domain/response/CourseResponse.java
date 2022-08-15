package com.example.mongorest.domain.response;

import com.example.mongorest.domain.Course;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Guohua Zhang
 * @create 2022-08-08 2:33 AM
 */
@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CourseResponse {
    private Boolean success;
    private String message;
    private Course course;
}
