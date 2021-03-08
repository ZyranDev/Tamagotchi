package com.maimai.tamagotchi.manager;

import com.google.gson.annotations.SerializedName;
import com.maimai.tamagotchi.api.manager.Manager;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SimpleManager<K, V> implements Manager<K, V> {

    @SerializedName("values")
    protected final Map<K, V> map;

    public SimpleManager() {
        this.map = new HashMap<>();
    }

    @Override
    public void addManageableObject(K key, V value) {
        map.put(key, value);
    }

    @Override
    public V getManageableObject(K key) {
        return map.get(key);
    }

    @Override
    public Map<K, V> getMap() {
        return Collections.unmodifiableMap(map);
    }
}