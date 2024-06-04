package com.akash.low.level.design.designpatterns.creational.factoryds;

public class ECCarFactory implements CarFactory {
    @Override
    public Car getCarInstance(String name) {
        if (name.equals("EC1")) {
            return new EC1();
        } else if (name.equals("EC2")) {
            return new EC2();
        }
        return null;
    }
}
