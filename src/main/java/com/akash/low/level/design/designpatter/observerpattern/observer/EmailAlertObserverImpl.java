package com.akash.low.level.design.designpatter.observerpattern.observer;

import com.akash.low.level.design.designpatter.observerpattern.observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    String userName;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
        this.userName = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(userName, "product is in stock.....");
    }

    private void sendMail(String userName, String msg) {
        System.out.println("msg sent to" + userName);
    }
}
