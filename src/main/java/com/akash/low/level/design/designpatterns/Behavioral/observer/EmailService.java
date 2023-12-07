package com.akash.low.level.design.designpatterns.Behavioral.observer;

//public class EmailService {
//    public void sendEmail() {
//        System.out.println("Sending email");
//    }
//}

import com.akash.low.level.design.designpatterns.Behavioral.observer.interfaces.Observer;

public class EmailService implements Observer {
    @Override
    public void update() {
        System.out.println("Sending email");
    }
}