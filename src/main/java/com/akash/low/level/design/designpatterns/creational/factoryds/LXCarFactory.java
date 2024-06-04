package com.akash.low.level.design.designpatterns.creational.factoryds;

public class LXCarFactory implements CarFactory {
    @Override
    public Car getCarInstance(String name) {
        if (name.equals("LX1")) {
            return new LX1();
        } else {
            return new LX2();
        }
    }
}
