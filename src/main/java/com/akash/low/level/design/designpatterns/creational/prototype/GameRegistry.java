package com.akash.low.level.design.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class GameRegistry {
    private Map<GraphicalObjectType, GraphicalObject> registery = new HashMap<>();

    public void addPrototype(GraphicalObjectType type, GraphicalObject object) {
        this.registery.put(type, object);
    }

    public GraphicalObject getPrototype(GraphicalObjectType type) {
        return this.registery.get(type).clone();
    }
}
