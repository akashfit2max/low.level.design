package com.akash.low.level.design.designpatterns.Structural.Decorator;

import lombok.AllArgsConstructor;

// step 3 - implement common class for all decoraters
@AllArgsConstructor
public abstract class BaseDecorator implements Database {
    protected Database db;
}
