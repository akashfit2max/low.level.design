package com.akash.low.level.design.designpatterns.creational.builder.v5;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Student student = Student.builder().setAge(10).setEmail("aks").setName("aks").setStartDate(new Date()).build();
        System.out.println(student.toString());
    }
}
