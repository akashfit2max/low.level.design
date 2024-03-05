package com.akash.low.level.design.case_studies.cache.interfaces;

public interface Cache<K, V> {
    void create(K key, V value);

    void get(K key);

    void update(K key, V value);

    void delete(K key);
}
