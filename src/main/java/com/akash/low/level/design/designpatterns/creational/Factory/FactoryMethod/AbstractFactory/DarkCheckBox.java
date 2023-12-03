package com.akash.low.level.design.designpatterns.creational.Factory.FactoryMethod.AbstractFactory;

public class DarkCheckBox implements CheckBox{
    @Override
    public void render() {
        System.out.println("dark");
    }
}
