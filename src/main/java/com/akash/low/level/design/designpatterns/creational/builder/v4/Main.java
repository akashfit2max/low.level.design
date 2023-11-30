package com.akash.low.level.design.designpatterns.creational.builder.v4;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Student student = Student.builder().age(10).email("aks").name("aks").startDate(new Date()).build();
        System.out.println(student.toString());

    }
}
