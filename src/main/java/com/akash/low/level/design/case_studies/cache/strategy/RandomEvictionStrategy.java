package com.akash.low.level.design.case_studies.cache.strategy;

import com.akash.low.level.design.case_studies.cache.interfaces.Consumer;
import com.akash.low.level.design.case_studies.cache.models.EventType;

import java.util.ArrayList;
import java.util.List;

public class RandomEvictionStrategy<K> implements EvictionStrategy<K>, Consumer<K> {
    private List<K> keys = new ArrayList<>();

    @Override
    public K evict() {
        return null;
    }

    @Override
    public void notifyChange(EventType eventType, K key) {
        if (eventType == EventType.READ) return;
        keys.add(key);
    }
}
