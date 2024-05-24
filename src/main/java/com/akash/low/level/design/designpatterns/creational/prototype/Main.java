package com.akash.low.level.design.designpatterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("aks", 1);
        Student student1 = (Student) student.clone();
    }
}
