package com.akash.low.level.design.designpatterns.creational.Factory.FactoryMethod.AbstractFactory;

public class LightCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("dark");
    }
}
