package com.akash.low.level.design.designpatter.observerpattern.observable;

import com.akash.low.level.design.designpatter.observerpattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable {

    private List<NotificationAlertObserver> notificationAlertObservers = new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        notificationAlertObservers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        notificationAlertObservers.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        notificationAlertObservers.stream().forEach(observer -> {
            observer.update();
        });
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if (stockCount == 0) {
            notifySubscriber();
        }
        stockCount += newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
