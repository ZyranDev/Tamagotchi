package com.maimai.tamagotchi.manager;

import com.google.gson.Gson;
import com.maimai.tamagotchi.consumable.base.ConsumableEntity;
import com.maimai.tamagotchi.consumable.subject.ConsumableSubject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumableManager {
    private final Map<ConsumableSubject, List<Integer>> map;

    public ConsumableManager() {
        map = new HashMap<>();
    }

    public void addMoney(ConsumableSubject subject, int value) {
        if (!map.containsKey(subject)) {
            map.put(subject, new ArrayList<>());
        }

        List<ConsumableEntity> consumableEntities = new ArrayList<>();
        consumableEntities.add(new ConsumableEntity(subject, value));
        Gson gson = new Gson();
        gson.toJson(consumableEntities);
        map.get(subject).add(value);
    }

    public double getMoney(ConsumableSubject subject) {
        if (!map.containsKey(subject)) return 0;

        List<Integer> mapList = map.get(subject);
        double money = 0;
        for (int value : mapList) {
            money += value;
        }

        return money;
    }
}
