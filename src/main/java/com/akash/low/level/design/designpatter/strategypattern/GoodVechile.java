package com.akash.low.level.design.designpatter.strategypattern;

import com.akash.low.level.design.designpatter.strategypattern.strategies.DriverStrategy;
import com.akash.low.level.design.designpatter.strategypattern.strategies.NormalDriveStrategy;

public class GoodVechile extends Vechile {
    GoodVechile() {
        super(new NormalDriveStrategy());
    }
}
