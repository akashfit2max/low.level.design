package com.akash.low.level.design.designpatterns.creational.Factory;

public class SecondaryButton implements Button {
    @Override
    public void render() {
        System.out.println("secondary button");
    }
}
