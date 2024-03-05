package com.akash.low.level.design.case_studies.cache.interfaces;

import com.akash.low.level.design.case_studies.cache.models.EventType;

import java.util.ArrayList;
import java.util.List;

public abstract class Producer<K> {
    List<Consumer<K>> consumers = new ArrayList<>();

    public void register(Consumer<K> consumer) {
        consumers.add(consumer);
    }

    public void deregister(Consumer<K> consumer) {
        consumers.remove(consumer);
    }

    public void notifyConsumers(EventType eventType, K Key) {
        consumers.forEach(consumer -> consumer.notifyChange(eventType, Key));
    }
}
