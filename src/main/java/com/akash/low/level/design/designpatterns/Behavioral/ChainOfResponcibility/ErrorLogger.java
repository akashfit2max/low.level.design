package com.akash.low.level.design.designpatterns.Behavioral.ChainOfResponcibility;

public class ErrorLogger extends LogProcessor {
    ErrorLogger(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String msg) {
        if (logLevel == ERROR) {
            System.out.println("ERROR: " + msg);
        } else {
            super.log(logLevel, msg);
        }
    }
}
