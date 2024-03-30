package com.akash.low.level.design.designpatterns.Behavioral.MediatorDS;

public class Main {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new Auction();
        Colleague colleague1 = new Bidder("A",auctionMediator);
        Colleague colleague2 = new Bidder("B",auctionMediator);

        auctionMediator.placeBidding(colleague1,1000);
        auctionMediator.placeBidding(colleague2,2000);
        auctionMediator.placeBidding(colleague1,3000);
    }
}
