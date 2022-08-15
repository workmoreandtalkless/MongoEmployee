package com.example.mongorest.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Guohua Zhang
 * @create 2022-08-15 10:13 AM
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Document
public class Employee {
    @Id
    @ApiModelProperty(notes = "The database generated Course ID")
    private String id;

    @ApiModelProperty
    private String userId;

//    @ApiModelProperty
//    private String firstName;
//
//    @ApiModelProperty
//    private String lastName;
//
//    @ApiModelProperty
//    private String middleName;
//    @ApiModelProperty
//    private String preferedName;
//    @ApiModelProperty
//    private String Email;
//    @ApiModelProperty
//    private String cellPhone;
//    @ApiModelProperty
//    private String alternatePhone;
//    @ApiModelProperty
//    private String gender;
//    @ApiModelProperty
//    private String SSN;
//    @ApiModelProperty
//    private Data DOB;
//    @ApiModelProperty
//    private Data startData;
//    @ApiModelProperty
//    private Data endData;
//    @ApiModelProperty
//    private String driverLicense;
//    @ApiModelProperty
//    private Data driverLicenseExpiration;
//    @ApiModelProperty
//    private String houseID;
//

}
