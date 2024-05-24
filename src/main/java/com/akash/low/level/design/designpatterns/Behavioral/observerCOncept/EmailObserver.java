package com.akash.low.level.design.designpatterns.Behavioral.observerCOncept;

public class EmailObserver implements Observer {
    @Override
    public void update() {
        System.out.println("update by mail");
    }
}
