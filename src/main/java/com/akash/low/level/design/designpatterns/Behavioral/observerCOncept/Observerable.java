package com.akash.low.level.design.designpatterns.Behavioral.observerCOncept;

public interface Observerable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObserver();
    void setData();


}
