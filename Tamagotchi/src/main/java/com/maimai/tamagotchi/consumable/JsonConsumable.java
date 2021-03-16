package com.maimai.tamagotchi.consumable;

import com.maimai.tamagotchi.consumable.base.Consumable;
import com.maimai.tamagotchi.utils.JsonFile;

public class JsonConsumable implements IConsumable {
    private JsonFile jsonFile;

    public JsonConsumable(JsonFile jsonFile) {
        this.jsonFile = jsonFile;
    }

    @Override
    public void load() {
        /* Uncomment when you make sure that the JSON is available in the project */
        try {

        } catch (Exception e) {

        }
    }

    @Override
    public void save() {
        /* Uncomment when you make sure that the JSON is available in the project */
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
