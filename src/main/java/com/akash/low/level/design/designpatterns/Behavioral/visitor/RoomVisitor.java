package com.akash.low.level.design.designpatterns.Behavioral.visitor;

public interface RoomVisitor {
    void visit(SingleRoom singleRoom);

    void visit(DoubleRoom doubleRoom);

}
