package com.akash.low.level.design.solidprincipals.v1;

public class Sparrow extends Bird {

    public Sparrow(int weight, int height, int size) {
        super(weight, height, size);
    }

    @Override
    public void fly() {
        System.out.println("sparrow is flying");
    }
}
