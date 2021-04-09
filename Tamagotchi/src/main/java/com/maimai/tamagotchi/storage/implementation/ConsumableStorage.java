package com.maimai.tamagotchi.storage.implementation;

import com.maimai.tamagotchi.mascot.subject.ConsumableSubject;
import com.maimai.tamagotchi.storage.IStorage;

import java.util.HashMap;
import java.util.Map;

public class ConsumableStorage implements IStorage<ConsumableSubject, Integer> {

    private final Map<ConsumableSubject, Integer> consumables = new HashMap<>();

    @Override
    public Map<ConsumableSubject, Integer> get() {
        return consumables;
    }
}
