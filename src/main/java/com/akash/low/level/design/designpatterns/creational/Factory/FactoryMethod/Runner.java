package com.akash.low.level.design.designpatterns.creational.Factory.FactoryMethod;

import com.akash.low.level.design.designpatterns.creational.Factory.Button;

public class Runner {
    public static void main(String[] args) {
        Button pr = new PrimaryButtonFactory().creatButton();
        Button sr = new SecondaryPrimaryFactory().creatButton();

        pr.render();
        sr.render();
    }
}
