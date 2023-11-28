package com.akash.low.level.design.solidprincipals.v3;

import com.akash.low.level.design.solidprincipals.v3.interfaces.Flayable;

public class Eagle extends Bird implements Flayable {

    private GlidingBehaviour glidingBehaviour;

    public Eagle(int weight, int height, int size, GlidingBehaviour glidingBehaviour) {
        super(weight, height, size);
        this.glidingBehaviour = glidingBehaviour;
    }

    @Override
    public void fly() {
        glidingBehaviour.makeFly();
    }
}
