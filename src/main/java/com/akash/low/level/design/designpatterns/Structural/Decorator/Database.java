package com.akash.low.level.design.designpatterns.Structural.Decorator;

// step 1 - create a common interface
public interface Database {
    public String read();

    public void write(String input);
}
