package com.akash.low.level.design.designpatterns.Behavioral.visitor;

public class RoomMaintainanceVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("single room maintenance");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("double room maintenance");
    }
}
