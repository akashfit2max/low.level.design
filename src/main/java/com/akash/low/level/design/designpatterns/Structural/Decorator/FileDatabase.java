package com.akash.low.level.design.designpatterns.Structural.Decorator;

// step 2 - create concrete classes
public class FileDatabase implements Database{
    @Override
    public String read() {
        return "Value";
    }

    @Override
    public void write(String input) {
        System.out.println("writing" + input);
    }
}
