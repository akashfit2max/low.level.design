package com.akash.low.level.design.designpatterns.Behavioral.observer;

import com.akash.low.level.design.designpatterns.Behavioral.observer.interfaces.BitCoinManager;
import com.akash.low.level.design.designpatterns.Behavioral.observer.interfaces.Observer;
import com.akash.low.level.design.designpatterns.Behavioral.observer.models.Bitcoin;

//public class InMemoryBasedBitCoinManager implements BitCoinManager {
//
//    private Bitcoin bitcoin;
//    private EmailService emailService;
//    private TweetService tweetService;
//
//    @Override
//    public void setPrice(Double price) {
//        bitcoin.setPrice(price);
//        emailService.sendEmail();
//        tweetService.tweet();
//    }
//}

// SRC + OC violation


public class InMemoryBasedBitCoinManager extends Observable implements BitCoinManager {


    private Bitcoin bitcoin = new Bitcoin(0.0);

    @Override
    public void setPrice(Double price) {
        bitcoin.setPrice(price);
        notifyChange();
    }
}