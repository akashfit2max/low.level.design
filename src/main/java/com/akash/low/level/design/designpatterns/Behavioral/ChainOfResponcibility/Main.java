package com.akash.low.level.design.designpatterns.Behavioral.ChainOfResponcibility;

public class Main {

    // allow multiple objects to handel a request without the sender needing to know about the object which will ultimately resolve iy
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogger(new DebugLogger(new ErrorLogger(null)));
        logProcessor.log(LogProcessor.ERROR, "exception occured");
        logProcessor.log(LogProcessor.DEBUG, "need to debug");
        logProcessor.log(LogProcessor.INFO, "just an info msg");
    }
}
