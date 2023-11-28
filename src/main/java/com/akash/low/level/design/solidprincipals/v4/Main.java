package com.akash.low.level.design.solidprincipals.v4;

import com.akash.low.level.design.solidprincipals.v4.interfaces.Flayable;

public class Main {

    public static void main(String[] args) {
        Flayable eagle = new Eagle(10, 2, 2, new GlidingBehaviour());
        eagle.fly();

        Flayable parrot = new Parrot(10, 10, 10, new FlappingBehavior());
        parrot.fly();

    }
}


// sparrow class - concrete
// flappingBehaviour - concrete
// no two concrete classes should depend on each other
// to avoid this we can use interfaces

// sparrow and flappingBehaviour are tightly coupled