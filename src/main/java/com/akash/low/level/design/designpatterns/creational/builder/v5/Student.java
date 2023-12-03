package com.akash.low.level.design.designpatterns.creational.builder.v5;

import lombok.ToString;

import java.util.Date;

@ToString
public class Student {
    private String name;
    private String email;
    private Integer age;
    private Date startDate;

    // hide const
    private Student() {
    }

    public static StudetBuilder builder() {
        return new StudetBuilder();
    }

    public static class StudetBuilder {
        private Student student;

        public StudetBuilder() {
            student = new Student();
        }

        public StudetBuilder setName(String name) {
            student.name = name;
            return this;
        }

        public StudetBuilder setEmail(String email) {
            student.email = email;
            return this;
        }

        public StudetBuilder setAge(Integer age) {
            student.age = age;
            return this;
        }

        public StudetBuilder setStartDate(Date startDate) {
            student.startDate = startDate;
            return this;
        }

        public Student build() {
            return student;
        }
    }

}
