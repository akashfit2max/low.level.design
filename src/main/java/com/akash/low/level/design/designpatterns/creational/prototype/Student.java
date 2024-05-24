package com.akash.low.level.design.designpatterns.creational.prototype;

public class Student implements Prototype {
    private String name;
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public Prototype clone() {
        return new Student(name, id);
    }
}
