package com.akash.low.level.design.designpatter.observerpattern.observable;

import com.akash.low.level.design.designpatter.observerpattern.observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscriber();

    public void setStockCount(int newStockAdded);

    public int getStockCount();
}
