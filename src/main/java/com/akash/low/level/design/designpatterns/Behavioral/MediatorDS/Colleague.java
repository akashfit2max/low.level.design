package com.akash.low.level.design.designpatterns.Behavioral.MediatorDS;

public interface Colleague {
    void placeBid(int bidAmount);

    void recieveBidNotification(int bidAmount);

    String getName();

}
