package com.akash.low.level.design.designpatterns.Behavioral.observer;

//public class TweetService {
//    public void tweet() {
//        System.out.println("tweeting...");
//    }
//}

import com.akash.low.level.design.designpatterns.Behavioral.observer.interfaces.Observer;

public class TweetService implements Observer {
    @Override
    public void update() {
        System.out.println("tweeting...");
    }
}