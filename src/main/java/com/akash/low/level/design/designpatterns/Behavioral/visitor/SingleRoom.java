package com.akash.low.level.design.designpatterns.Behavioral.visitor;

public class SingleRoom implements Room {

    int roomPrice = 0;

    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
