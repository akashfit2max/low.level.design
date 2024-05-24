package com.akash.low.level.design.designpatterns.Behavioral.observerCOncept;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observerable {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        observers.forEach(Observer::update);
    }

    @Override
    public void setData() {
        notifyAllObserver();
    }
}
