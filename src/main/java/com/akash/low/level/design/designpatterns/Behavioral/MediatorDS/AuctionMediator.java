package com.akash.low.level.design.designpatterns.Behavioral.MediatorDS;

public interface AuctionMediator {
    void addBidder(Colleague bidder);

    void placeBidding(Colleague bidder, int bidAmount);
}
