package com.akash.low.level.design.designpatterns.creational.builder.v2;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Student.StudetBuilder studetBuilder = new Student.StudetBuilder();
        studetBuilder.setName("aks");
        studetBuilder.setAge(10);
        studetBuilder.setEmail("dadadasa");
        studetBuilder.setStartDate(new Date());

        Student student = studetBuilder.build();
    }
}
