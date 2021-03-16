package com.maimai.tamagotchi.consumable;

import com.google.gson.Gson;
import com.maimai.tamagotchi.consumable.base.Consumable;
import com.maimai.tamagotchi.consumable.base.ConsumableEntity;
import com.maimai.tamagotchi.utils.JsonFile;
import com.maimai.tamagotchi.utils.serialization.SerializationUtils;

public class JsonConsumable implements IConsumable {
    private final JsonFile jsonFile;
    private ConsumableEntity consumableEntity;
    private boolean loaded;

    public JsonConsumable(JsonFile jsonFile) {
        this.jsonFile = jsonFile;
    }

    @Override
    public void load() {
        Gson gson = SerializationUtils.getGSON();
        try {

        } catch (Exception e) {

        }
    }

    @Override
    public void save() {

    }

    @Override
    public Consumable getConsumableEntity() {
        return null;
    }

    @Override
    public String getSessionName() {
        return null;
    }
}
