package com.akash.low.level.design.designpatter.strategypattern.strategies;

public class SportsDriveStrategy implements DriverStrategy {
    @Override
    public void drive() {
        System.out.println("sports drive mode");
    }
}
