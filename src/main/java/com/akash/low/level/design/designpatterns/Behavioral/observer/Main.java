package com.akash.low.level.design.designpatterns.Behavioral.observer;

import com.akash.low.level.design.designpatterns.Behavioral.observer.interfaces.BitCoinManager;

public class Main {
    public static void main(String[] args) {
        Observable bitCoinManager = new InMemoryBasedBitCoinManager();
        bitCoinManager.register(new EmailService());
        bitCoinManager.register(new TweetService());

        ((BitCoinManager) bitCoinManager).setPrice(10.0);

    }
}
