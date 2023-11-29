package com.akash.low.level.design.designpatterns.creational.builder.v1;

import lombok.ToString;

import java.util.Date;

@ToString
public class Studentv1 {
    private String name;
    private String email;
    private Integer age;
    private Date startDate;

    public Studentv1(StudentParameters studentParameters) {
        this.name = studentParameters.getName();
        this.email = studentParameters.getEmail();
        this.age = studentParameters.getAge();
    }
}

// problems:
// - type safety
// - no static keyword
// - open close
