package com.akash.low.level.design.designpatter.strategypattern.strategies;

public class NormalDriveStrategy implements DriverStrategy {
    @Override
    public void drive() {
        System.out.println("normal drive mode");
    }
}
