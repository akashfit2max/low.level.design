package com.akash.low.level.design.designpatterns.Behavioral.nullObject;

public class Car implements Vehicle{

    @Override
    public String tankCapacity() {
        return "40";
    }

    @Override
    public String seatCapacity() {
        return "5";
    }
}
