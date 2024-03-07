package com.akash.low.level.design.case_studies.cache.strategy;

import com.akash.low.level.design.case_studies.cache.interfaces.Consumer;
import com.akash.low.level.design.case_studies.cache.models.EventType;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RandomEvictionStrategy<K, V> implements EvictionStrategy<K, V>, Consumer<K> {
    private List<K> keys = new ArrayList<>();

    @Override
    public K evict() {
        int randomIndex = ThreadLocalRandom.current().nextInt(keys.size()) % keys.size();
        return keys.get(randomIndex);
    }

    @Override
    public void notifyChange(EventType eventType, K key) {
        if (eventType == EventType.READ) return;
        keys.add(key);
    }
}
