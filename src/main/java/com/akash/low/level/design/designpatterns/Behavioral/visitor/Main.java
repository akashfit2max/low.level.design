package com.akash.low.level.design.designpatterns.Behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();

        single.accept(new RoomPricingVisitor());
        System.out.println(((SingleRoom) single).roomPrice);

        doubleRoom.accept(new RoomMaintainanceVisitor());
        System.out.println(((DoubleRoom) doubleRoom).roomPrice);
    }
}
