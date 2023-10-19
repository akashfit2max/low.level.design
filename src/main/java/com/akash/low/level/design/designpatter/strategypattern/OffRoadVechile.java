package com.akash.low.level.design.designpatter.strategypattern;

import com.akash.low.level.design.designpatter.strategypattern.strategies.DriverStrategy;
import com.akash.low.level.design.designpatter.strategypattern.strategies.SportsDriveStrategy;

public class OffRoadVechile extends Vechile {
    OffRoadVechile() {
        super(new SportsDriveStrategy());
    }
}
