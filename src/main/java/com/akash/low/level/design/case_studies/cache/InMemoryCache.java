package com.akash.low.level.design.case_studies.cache;

import com.akash.low.level.design.case_studies.cache.interfaces.Cache;
import com.akash.low.level.design.case_studies.cache.strategy.EvictionStrategy;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryCache<K, V> implements Cache<K, V> {
    private Integer capacity;
    private Integer ttl;
    //    private Map<K, V> values = new HashMap<>();
    private Map<K, V> values = new ConcurrentHashMap<>();

    private EvictionStrategy<K> evictionStrategy;

    public InMemoryCache(Integer capacity, Integer ttl, EvictionStrategy evictionStrategy) {
        this.capacity = capacity;
        this.ttl = ttl;
        this.evictionStrategy = evictionStrategy;
    }

    @Override
    public void create(K key, V value) {
        if (values.size() > capacity) {
//            throw new RuntimeException("cache full");
            // remove an iteam already present
            K keyToRemove = evictionStrategy.evict();
            delete(keyToRemove);
        }
        values.put(key, value);
    }

    @Override
    public void get(K key) {
        values.get(key);
    }

    @Override
    public String toString() {
        return "InMemoryCache{" +
                "values=" + values +
                '}';
    }

    @Override
    public void update(K key, V value) {
        values.put(key, value);
    }

    @Override
    public void delete(K key) {
        values.remove(key);
    }


}
