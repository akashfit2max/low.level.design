package com.akash.low.level.design.designpatterns.Behavioral.observerCOncept;

public class Main {
    public static void main(String[] args) {
        Observerable observable = new ObservableImpl();
        observable.addObserver(new EmailObserver());
        observable.addObserver(new PhoneObserver());

        observable.setData();

    }
}
