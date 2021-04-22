package com.maimai.tamagotchi.util.cache.implementation;

import com.maimai.tamagotchi.mascot.subject.ConsumableSubject;
import com.maimai.tamagotchi.util.cache.ICache;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ConsumableCache implements ICache<ConsumableSubject, Integer> {

    private static final Map<ConsumableSubject, Integer> consumableMap = new HashMap<>();

    public Map<ConsumableSubject, Integer> get() {
        return consumableMap;
    }

    public void replaceValue(ConsumableSubject key, Integer value) {
        get().replace(key, value);
    }

    public void addValue(ConsumableSubject key, Integer value) {
        get().put(key, value);
    }


    public void removeValue(ConsumableSubject key) {
        get().remove(key);
    }


    public Integer getValue(ConsumableSubject key) {
        return get().get(key);
    }


    public Optional<Integer> find(ConsumableSubject key) {
        return Optional.ofNullable(get().get(key));
    }


    public boolean exists(ConsumableSubject key) {
        return get().containsKey(key);
    }
}
