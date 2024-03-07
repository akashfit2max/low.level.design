package com.akash.low.level.design.case_studies.cache.strategy;

public interface EvictionStrategy<K,V> {
    K evict();
}
