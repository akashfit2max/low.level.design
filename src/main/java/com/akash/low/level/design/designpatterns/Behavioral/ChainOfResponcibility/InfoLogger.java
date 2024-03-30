package com.akash.low.level.design.designpatterns.Behavioral.ChainOfResponcibility;

public class InfoLogger extends LogProcessor {
    InfoLogger(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String msg) {
        if (logLevel == INFO) {
            System.out.println("INFO: " + msg);
        } else {
            super.log(logLevel, msg);
        }
    }
}
