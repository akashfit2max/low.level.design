package com.akash.low.level.design.solidprincipals.v2;

import com.akash.low.level.design.solidprincipals.v2.interfaces.Flayable;

public class Sparrow extends Bird implements Flayable {

    public Sparrow(int weight, int height, int size) {
        super(weight, height, size);
    }

    @Override
    public void fly() {
        System.out.println("sparrow is flying");
    }
}
