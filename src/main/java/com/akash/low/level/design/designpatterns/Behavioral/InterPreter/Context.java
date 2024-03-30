package com.akash.low.level.design.designpatterns.Behavioral.InterPreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String, Integer> map = new HashMap<>();

    public void put(String variable, int value) {
        map.put(variable, value);
    }

    public int get(String variable) {
        return map.get(variable);
    }
}
