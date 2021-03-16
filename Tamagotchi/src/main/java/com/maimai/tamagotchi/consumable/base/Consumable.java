package com.maimai.tamagotchi.consumable.base;

import com.google.gson.Gson;
import com.maimai.tamagotchi.consumable.IConsumable;
import com.maimai.tamagotchi.consumable.subject.ConsumableSubject;
import com.maimai.tamagotchi.utils.serialization.SerializationUtils;

import java.util.ArrayList;
import java.util.List;

public class Consumable {
    List<ConsumableEntity.ConsumableItem> consumableItems = new ArrayList<>();
    Gson gson = SerializationUtils.getGSON();

    public void addConsumable(ConsumableSubject subject, int quantity) {
        consumableItems.add(new ConsumableEntity.ConsumableItem(subject, quantity));
    }

    public void removeConsumable(ConsumableSubject subject, int quantity) {
    }
}
