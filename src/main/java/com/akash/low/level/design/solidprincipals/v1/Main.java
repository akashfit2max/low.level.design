package com.akash.low.level.design.solidprincipals.v1;

public class Main {

    public static void main(String[] args) {
        Bird sparrow = new Sparrow(10, 2, 23);
        sparrow.fly();

        Bird parrot = new Parrot(10, 11, 2);
        parrot.fly();
    }
}
