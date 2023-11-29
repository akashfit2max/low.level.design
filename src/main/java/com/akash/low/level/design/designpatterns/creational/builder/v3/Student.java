package com.akash.low.level.design.designpatterns.creational.builder.v3;

import lombok.ToString;

import java.util.Date;

@ToString
public class Student {
    private String name;
    private String email;
    private Integer age;
    private Date startDate;

    // hide const
    private Student(StudetBuilder studetBuilder) {
        // validate(studentBuilder)
        this.age = studetBuilder.age;
        this.email = studetBuilder.email;
        this.name = studetBuilder.name;
        this.startDate = studetBuilder.startDate;
    }

    public static StudetBuilder builder() {
        return new StudetBuilder();
    }

    public static class StudetBuilder {
        private String name;
        private String email;
        private Integer age;
        private Date startDate;

        public StudetBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudetBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public StudetBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public StudetBuilder setStartDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

}
