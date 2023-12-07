package com.akash.low.level.design.designpatterns.Behavioral.strategy;

public class BikeStrategy implements NavigationStrategy {
    @Override
    public void navigate() {
        System.out.println("travelling from bike");
    }
}
