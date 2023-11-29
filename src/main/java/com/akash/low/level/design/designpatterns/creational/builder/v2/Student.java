package com.akash.low.level.design.designpatterns.creational.builder.v2;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Student {
    private String name;
    private String email;
    private Integer age;
    private Date startDate;

    // hide const
    private Student() {
    }

    @Getter
    @Setter
    public static class StudetBuilder {
        private String name;
        private String email;
        private Integer age;
        private Date startDate;

        public Student build() {
            Student student = new Student();
            student.age = this.age;
            student.email = this.email;
            student.name = this.name;
            student.startDate = this.startDate;
            return student;
        }
    }

}
