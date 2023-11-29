package com.akash.low.level.design.designpatterns.creational.builder.v1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Object> values = new HashMap<>();
        values.put("name", "akash");
        values.put("age", 100);
        values.put("email", "akas@gamil.com");

        Student student = new Student(values);
        System.out.println(student);


        StudentParameters studentParameters = new StudentParameters();
        studentParameters.setName("a");
        studentParameters.setAge(10);
        studentParameters.setEmail("Adsa");

        Studentv1 studentv1 = new Studentv1(studentParameters);
        System.out.println(studentv1);


    }
}
