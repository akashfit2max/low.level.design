package com.akash.low.level.design.solidprincipals.v2;

import com.akash.low.level.design.solidprincipals.v2.interfaces.Flayable;
import com.akash.low.level.design.solidprincipals.v2.interfaces.Swimable;

public class Main {

    public static void main(String[] args) {
        Flayable sparrow = new Sparrow(10, 2, 2);
        sparrow.fly();

        Swimable penguin = new Penguin(10, 10, 10);
        penguin.swim();
    }
}
