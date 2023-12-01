package com.akash.low.level.design.designpatterns.creational.Factory;

public class PrimaryButton implements Button {
    @Override
    public void render() {
        System.out.println("primary button");
    }
}
