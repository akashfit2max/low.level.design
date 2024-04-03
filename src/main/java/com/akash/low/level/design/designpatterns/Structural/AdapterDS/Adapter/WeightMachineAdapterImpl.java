package com.akash.low.level.design.designpatterns.Structural.AdapterDS.Adapter;

import com.akash.low.level.design.designpatterns.Structural.AdapterDS.Adaptee.WeightInPounds;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {

    WeightInPounds weightInPounds;

    public WeightMachineAdapterImpl(WeightInPounds weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    @Override
    public double WeightInKgs() {
        double weightInPound = weightInPounds.getWeightInPound();
        double weightInKg = weightInPound * .45;
        return weightInKg;

    }
}
