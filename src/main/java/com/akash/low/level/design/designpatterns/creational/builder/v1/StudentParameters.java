package com.akash.low.level.design.designpatterns.creational.builder.v1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentParameters {
    private String name;
    private String email;
    private Integer age;
    private Date startDate;
}
