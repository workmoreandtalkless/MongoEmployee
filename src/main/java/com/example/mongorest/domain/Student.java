package com.example.mongorest.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Guohua Zhang
 * @create 2022-08-08 2:31 AM
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

@Document
public class Student {

    @ApiModelProperty
    private String fullName;

    @ApiModelProperty
    private String grade;


}
