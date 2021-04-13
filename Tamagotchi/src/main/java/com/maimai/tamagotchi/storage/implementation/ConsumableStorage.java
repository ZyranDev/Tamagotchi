package com.maimai.tamagotchi.storage.implementation;

import com.maimai.tamagotchi.mascot.subject.ConsumableSubject;
import com.maimai.tamagotchi.storage.IStorage;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ConsumableStorage implements IStorage<ConsumableSubject, Integer> {

    private final Map<ConsumableSubject, Integer> consumables = new HashMap<>();

    @Override
    public Map<ConsumableSubject, Integer> get() {
        return consumables;
    }

    @Override
    public Optional<Integer> find(ConsumableSubject key) {
        return Optional.ofNullable(get().get(key));
    }

    @Override
    public Integer getValue(ConsumableSubject key) {
        return get().get(key);
    }

    @Override
    public boolean exists(ConsumableSubject key) {
        return get().containsKey(key);
    }

    @Override
    public void addValue(ConsumableSubject key, Integer value) {
        get().put(key, value);
    }

    @Override
    public void removeValue(ConsumableSubject key) {
        get().remove(key);
    }
}
