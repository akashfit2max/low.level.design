package com.akash.low.level.design.designpatterns.Structural.Bridge;

public class LandBreathImplementation implements BreathImplementor {
    @Override
    public void breath() {
        System.out.println("land breating");
    }
}
