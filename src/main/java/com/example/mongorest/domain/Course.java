package com.example.mongorest.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author Guohua Zhang
 * @create 2022-08-08 2:30 AM
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Document
public class Course {
    @Id
    @ApiModelProperty(notes = "The database generated Course ID")
    private String id;

    @ApiModelProperty
    private String name;

    @ApiModelProperty
    private String description;

    @ApiModelProperty
    private Professor professor;

    @ApiModelProperty
    private List<Student> students;

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", professor=" + professor +
                '}';
    }
}
