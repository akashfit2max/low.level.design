package com.akash.low.level.design.solidprincipals.v1;

public class Parrot extends Bird {

    public Parrot(int weight, int height, int size) {
        super(weight, height, size);
    }

    @Override
    public void fly() {
        System.out.println("parrot is flying");
    }
}
