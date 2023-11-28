package com.akash.low.level.design.solidprincipals.v1;

public class Penguin extends Bird {


    public Penguin(int weight, int height, int size) {
        super(weight, height, size);
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub

        // Our design is forcing penguin to fly which is bad. 3rd Principle - Liskov substitution is used to fix these kind of problems.
    }
}
