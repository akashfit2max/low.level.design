package com.akash.low.level.design.designpatterns.Behavioral.MediatorDS;

public class Bidder implements Colleague {

    String name;
    AuctionMediator auctionMediator;

    public Bidder(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBidding(this, bidAmount);
    }

    @Override
    public void recieveBidNotification(int bidAmount) {
        System.out.println("bidder : " + name + " has placed a bid of amount - " + bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }
}
