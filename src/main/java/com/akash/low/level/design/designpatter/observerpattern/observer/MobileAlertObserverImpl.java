package com.akash.low.level.design.designpatter.observerpattern.observer;

import com.akash.low.level.design.designpatter.observerpattern.observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String emailId, StocksObservable observable) {
        this.userName = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName, "product is in stock.....");
    }

    private void sendMsgOnMobile(String userName, String msg) {
        System.out.println("msg sent to" + userName);
    }
}
