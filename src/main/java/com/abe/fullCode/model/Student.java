package com.abe.fullCode.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Student {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer stuId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String course;
    private Date dob;

}


