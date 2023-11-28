package com.akash.low.level.design.solidprincipals.v3;

import com.akash.low.level.design.solidprincipals.v3.interfaces.Flayable;

public class Parrot extends Bird implements Flayable {

    private FlappingBehavior flappingBehavior;

    public Parrot(int weight, int height, int size, FlappingBehavior flappingBehavior) {
        super(weight, height, size);
        this.flappingBehavior = flappingBehavior;
    }

    @Override
    public void fly() {
        flappingBehavior.doFly();
    }

}
