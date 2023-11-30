package com.akash.low.level.design.designpatterns.creational.builder.v4;

import lombok.Builder;
import lombok.ToString;

import java.util.Date;

@ToString
@Builder
public class Student {
    private String name;
    private String email;
    private Integer age;
    private Date startDate;
}
