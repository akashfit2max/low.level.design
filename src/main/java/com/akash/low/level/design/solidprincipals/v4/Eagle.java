package com.akash.low.level.design.solidprincipals.v4;

import com.akash.low.level.design.solidprincipals.v4.interfaces.Flayable;
import com.akash.low.level.design.solidprincipals.v4.interfaces.FlyingBehavior;

public class Eagle extends Bird implements Flayable {

    private FlyingBehavior flyingBehavior;

    public Eagle(int weight, int height, int size, FlyingBehavior flyingBehavior) {
        super(weight, height, size);
        this.flyingBehavior = flyingBehavior;
    }

    @Override
    public void fly() {
        flyingBehavior.makeFly();
    }
}
