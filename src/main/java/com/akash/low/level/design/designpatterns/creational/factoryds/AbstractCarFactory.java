package com.akash.low.level.design.designpatterns.creational.factoryds;

public class AbstractCarFactory {
    public CarFactory getCarFactory(String name) {
        if (name.equals("ECF")) {
            return new ECCarFactory();
        } else {
            return new LXCarFactory();
        }
    }
}
