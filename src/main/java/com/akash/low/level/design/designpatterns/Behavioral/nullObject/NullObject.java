package com.akash.low.level.design.designpatterns.Behavioral.nullObject;

public class NullObject implements Vehicle{
    @Override
    public String tankCapacity() {
        return "0";
    }

    @Override
    public String seatCapacity() {
        return "0";
    }
}
