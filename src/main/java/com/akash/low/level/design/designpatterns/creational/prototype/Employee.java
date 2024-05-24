package com.akash.low.level.design.designpatterns.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Prototype {
    private int age;
    private String address;


    @Override
    public Prototype clone() {
        return new Employee(age, address);
    }
}
