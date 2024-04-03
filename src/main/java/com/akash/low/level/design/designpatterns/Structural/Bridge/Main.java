package com.akash.low.level.design.designpatterns.Structural.Bridge;

public class Main {
    public static void main(String[] args) {
        LivingThings livingThings = new Bird(new WaterBreathImplementor());
        livingThings.breathProcess();
    }
}
