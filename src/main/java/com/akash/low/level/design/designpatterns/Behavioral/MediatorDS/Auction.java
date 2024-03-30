package com.akash.low.level.design.designpatterns.Behavioral.MediatorDS;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator {

    List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void addBidder(Colleague bidder) {
        colleagues.add(bidder);
    }

    @Override
    public void placeBidding(Colleague bidder, int bidAmount) {
        colleagues.forEach(colleague -> {
            if (!colleague.getName().equals(bidder.getName())) {
                bidder.recieveBidNotification(bidAmount);
            }
        });
    }
}
