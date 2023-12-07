package com.akash.low.level.design.designpatterns.Behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator(new CarStrategy());
        navigator.navigate();


        Navigator navigator2 = new Navigator(new BikeStrategy());
        navigator2.navigate();

    }
}
