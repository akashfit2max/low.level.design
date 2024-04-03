package com.akash.low.level.design.designpatterns.Structural.AdapterDS;

import com.akash.low.level.design.designpatterns.Structural.AdapterDS.Adaptee.WeightMachineForBabies;
import com.akash.low.level.design.designpatterns.Structural.AdapterDS.Adapter.WeightMachineAdapter;
import com.akash.low.level.design.designpatterns.Structural.AdapterDS.Adapter.WeightMachineAdapterImpl;

public class Client {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.WeightInKgs());
    }


}
