package com.akash.low.level.design.designpatterns.Structural.FacadeDS;

public class Main {
    /*
     *  facade - when we want to hide the system complexcity from client
     *  client - facade - system
     * */
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.creatOrder();

    }
}
