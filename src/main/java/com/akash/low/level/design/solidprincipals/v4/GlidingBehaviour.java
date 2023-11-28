package com.akash.low.level.design.solidprincipals.v4;

import com.akash.low.level.design.solidprincipals.v4.interfaces.FlyingBehavior;

public class GlidingBehaviour implements FlyingBehavior {
    public void makeFly() {
        System.out.println("Whee I am Gliding");
    }
}
