package com.maimai.tamagotchi.consumable.base;

import com.google.gson.Gson;
import com.maimai.tamagotchi.consumable.IConsumable;
import com.maimai.tamagotchi.consumable.subject.ConsumableSubject;
import com.maimai.tamagotchi.utils.serialization.SerializationUtils;

import java.util.ArrayList;
import java.util.List;

public class Consumable implements IConsumable {
    List<ConsumableEntity.ConsumableItem> consumableItems = new ArrayList<>();
    Gson gson = SerializationUtils.getGSON();

    public void addConsumable(ConsumableSubject subject, int quantity) {
        consumableItems.add(new ConsumableEntity.ConsumableItem(subject, quantity));
    }

    @Override
    public void load() {
        for (int i = 0; i < consumableItems.size(); i++) {
            System.out.println(consumableItems.get(i));
        }
    }

    @Override
    public void save() {
        /* Uncomment when you make sure that the JSON is available in the project */
        return;
    }
}
