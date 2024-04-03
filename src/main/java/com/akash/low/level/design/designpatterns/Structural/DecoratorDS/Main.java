package com.akash.low.level.design.designpatterns.Structural.DecoratorDS;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new Mushroom(new ExtraCheese(new Margarita()));
        System.out.println(basePizza.cost());
    }

}
