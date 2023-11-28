package com.akash.low.level.design.solidprincipals.v2;

import com.akash.low.level.design.solidprincipals.v2.interfaces.Flayable;

public class Parrot extends Bird implements Flayable {

    public Parrot(int weight, int height, int size) {
        super(weight, height, size);
    }

    @Override
    public void fly() {
        System.out.println("parrot is flying");
    }

}
