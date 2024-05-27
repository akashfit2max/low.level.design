package com.akash.low.level.design.designpatterns.Behavioral.visitor;

public class RoomPricingVisitor implements RoomVisitor{

    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("single room price");
        singleRoom.roomPrice = 1000;
    }


    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("double room price");
        doubleRoom.roomPrice = 1000;
    }
}
