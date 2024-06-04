package com.akash.low.level.design.designpatterns.creational.factoryds;

public class Main {
    public static void main(String[] args) {
        AbstractCarFactory abstractCarFactory = new AbstractCarFactory();
        CarFactory ecf = abstractCarFactory.getCarFactory("ECFsda");
        Car ec2 = ecf.getCarInstance("LX1");
        ec2.getName();
    }
}
