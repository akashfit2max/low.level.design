package com.akash.low.level.design.designpatterns.creational.prototype;

public class Main {

    public static void main(String[] args) {

        GameRegistry gameRegistry = new GameRegistry();

        BackgroundObject backgroundObject = new BackgroundObject(100, 100, 100, 100, "red", GraphicalObjectType.FOR_GROUND);
        BackgroundObject backgroundObject1 = backgroundObject.clone();

        System.out.println(backgroundObject1);
        System.out.println(backgroundObject);

        // changin value

        backgroundObject1.setY(200);
        System.out.println(backgroundObject1);


        // using registry

        BackgroundObject bg = new BackgroundObject(100, 100, 100, 100, "red", GraphicalObjectType.FOR_GROUND);
        gameRegistry.addPrototype(GraphicalObjectType.FOR_GROUND,bg);

        //cloning
        GraphicalObject bg2 = gameRegistry.getPrototype(GraphicalObjectType.FOR_GROUND);

        System.out.println(bg);
        System.out.println(bg2);
    }
}
