package com.akash.low.level.design.designpatterns.creational.builder.v1;

import lombok.ToString;

import java.util.Date;
import java.util.Map;
import java.util.Objects;

@ToString
public class Student {
    private String name;
    private String email;
    private Integer age;
    private Date startDate;

    public Student(Map<String, Object> values) {
        this.name = values.get("name").toString();
        this.email = values.get("email").toString();
        this.age = (Integer) (values.get("age"));
    }
}

// problems:
// - type safety
// - no static keyword
// - open close
