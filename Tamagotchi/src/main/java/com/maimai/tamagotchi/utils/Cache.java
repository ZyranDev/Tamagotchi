package com.maimai.tamagotchi.utils;

import java.util.HashMap;
import java.util.Map;

public class Cache<K, V> {

    private final Map<K, V> cache;

    public Cache() {
        this.cache = new HashMap<>();
    }

    public Map<K, V> getCache() {
        return cache;
    }
}