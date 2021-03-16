package com.maimai.tamagotchi.consumable;

import com.maimai.tamagotchi.consumable.base.Consumable;

public interface IConsumable {
    void load();

    void save();

    default Consumable getConsumableEntity() {
        return null;
    }

    default String getSessionName() {
        return null;
    }
}
