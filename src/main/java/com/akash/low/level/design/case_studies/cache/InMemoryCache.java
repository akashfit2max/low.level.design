package com.akash.low.level.design.case_studies.cache;

import com.akash.low.level.design.case_studies.cache.interfaces.Cache;
import com.akash.low.level.design.case_studies.cache.interfaces.Producer;
import com.akash.low.level.design.case_studies.cache.models.EventType;
import com.akash.low.level.design.case_studies.cache.strategy.EvictionStrategy;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// this is my producer
public class InMemoryCache<K, V> extends Producer<K> implements Cache<K, V> {
    private Integer capacity;
    private Integer ttl;
    //    private Map<K, V> values = new HashMap<>();
    private Map<K, V> values = new ConcurrentHashMap<>();

    private EvictionStrategy<K, V> evictionStrategy;

    public InMemoryCache(Integer capacity, Integer ttl, EvictionStrategy<K, V> evictionStrategy) {
        this.capacity = capacity;
        this.ttl = ttl;
        this.evictionStrategy = evictionStrategy;
    }

    //    @Override
//    public void create(K key, V value) {
//        if (values.size() > capacity) {
//            throw new RuntimeException("cache full");
//             remove an iteam already present
//            K keyToRemove = evictionStrategy.evict();
//            delete(keyToRemove);
//        }
//        values.put(key, value);
//    }


    @Override
    public void create(K key, V value) {
        if (values.size() == capacity) {
            K keyToEvict = evictionStrategy.evict();
            delete(keyToEvict);
        }
        notifyConsumers(EventType.WRITE, key);
        values.put(key, value);
    }

    @Override
    public void get(K key) {
        notifyConsumers(EventType.READ, key);
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
        notifyConsumers(EventType.DELETE, key);
        values.remove(key);
    }


}
