package com.akash.low.level.design.designpatter.strategypattern;

import com.akash.low.level.design.designpatter.strategypattern.strategies.DriverStrategy;

public class Vechile {

    DriverStrategy driverStrategy;

    Vechile(DriverStrategy driverStrategy) {
        this.driverStrategy = driverStrategy;
    }

    public void drive() {
        driverStrategy.drive();
    }
}
