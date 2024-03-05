package com.akash.low.level.design.case_studies.cache.interfaces;

import com.akash.low.level.design.case_studies.cache.models.EventType;

/*
- suppose we want to use diff eviction strategy then we can use observer patterne
- consumers would be there eviction policies
* */
public interface Consumer<K> {
    void notifyChange(EventType eventType, K key);
}
