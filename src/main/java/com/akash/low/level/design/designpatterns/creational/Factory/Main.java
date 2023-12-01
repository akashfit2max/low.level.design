package com.akash.low.level.design.designpatterns.creational.Factory;

public class Main {

    public static void main(String[] args) {
        Button primary = ButtonFactory.creatInstance(ButtonType.PRIMARY);
        Button secondary = ButtonFactory.creatInstance(ButtonType.SECONDARY);

        primary.render();
        secondary.render();
    }
}
