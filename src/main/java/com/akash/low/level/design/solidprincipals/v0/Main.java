package com.akash.low.level.design.solidprincipals.v0;

public class Main {

    public static void main(String[] args) {
        Bird sparrow = new Bird(56, 180, BirdType.SPARROW);
        sparrow.fly();

        Bird parrot = new Bird(65, 180, BirdType.PEGION);
        parrot.fly();
    }
}
