package com.akash.low.level.design.designpatterns.Behavioral.visitor;

public interface Room {
    public void accept(RoomVisitor visitor);
}
