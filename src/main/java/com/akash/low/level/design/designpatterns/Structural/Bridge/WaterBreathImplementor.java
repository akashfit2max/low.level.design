package com.akash.low.level.design.designpatterns.Structural.Bridge;

public class WaterBreathImplementor implements BreathImplementor {
    @Override
    public void breath() {
        System.out.println("water breating");
    }
}
