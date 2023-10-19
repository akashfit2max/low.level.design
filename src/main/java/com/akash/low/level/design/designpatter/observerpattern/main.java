package com.akash.low.level.design.designpatter.observerpattern;

import com.akash.low.level.design.designpatter.observerpattern.observable.IphoneObservableImpl;
import com.akash.low.level.design.designpatter.observerpattern.observable.StocksObservable;
import com.akash.low.level.design.designpatter.observerpattern.observer.EmailAlertObserverImpl;
import com.akash.low.level.design.designpatter.observerpattern.observer.MobileAlertObserverImpl;
import com.akash.low.level.design.designpatter.observerpattern.observer.NotificationAlertObserver;

public class main {

    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("aks@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("ashi@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("mamata@gmail.com", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);


    }
}
