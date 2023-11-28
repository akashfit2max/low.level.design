package com.akash.low.level.design.solidprincipals.v2;

import com.akash.low.level.design.solidprincipals.v2.interfaces.Swimable;

public class Penguin extends Bird implements Swimable {


    public Penguin(int weight, int height, int size) {
        super(weight, height, size);
    }

    @Override
    public void swim() {
        System.out.println("penguin is swimming");
    }
}
