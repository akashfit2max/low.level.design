package com.akash.low.level.design.designpatterns.Behavioral.observer;

import com.akash.low.level.design.designpatterns.Behavioral.observer.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

// step 2 - publisher
public abstract class Observable {
    private List<Observer> observers = new ArrayList<>();

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void deregister(Observer observer) {
        observers.remove(observer);
    }

    public void notifyChange() {
        observers.forEach(observer -> {
            observer.update();
        });
    }
}
