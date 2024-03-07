package com.akash.low.level.design.case_studies.cache;

import com.akash.low.level.design.case_studies.cache.interfaces.Cache;
import com.akash.low.level.design.case_studies.cache.strategy.RandomEvictionStrategy;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Cache<String, String> cache = new InMemoryCache<>(3, 1000, new RandomEvictionStrategy());
        cache.create("test", "test");
        cache.create("test1", "test1");
        cache.create("test2", "test2");
        cache.create("test3", "test3");

//        IntStream.range(0, 4).forEach(index -> cache.create("test_" + index, "test_" + index));
        System.out.println(cache);
    }
}

// to make it thread safe
// 1. Lock - slow
// 2. synchronised
// 3. semaphores
// 4. atomic data types