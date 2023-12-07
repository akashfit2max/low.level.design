package com.akash.low.level.design.designpatterns.Behavioral.strategy;

public class CarStrategy implements NavigationStrategy {
    @Override
    public void navigate() {
        System.out.println("travelling by car.....");
    }
}
