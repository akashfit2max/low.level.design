package com.akash.low.level.design.designpatterns.Behavioral.ChainOfResponcibility;

public class DebugLogger extends LogProcessor {
    DebugLogger(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String msg) {
        if (logLevel == DEBUG) {
            System.out.println("DEBUG: " + msg);
        } else {
            super.log(logLevel, msg);
        }
    }
}
