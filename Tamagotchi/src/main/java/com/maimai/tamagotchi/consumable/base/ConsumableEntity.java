package com.maimai.tamagotchi.consumable.base;

import com.maimai.tamagotchi.consumable.subject.ConsumableSubject;

public class ConsumableEntity {
    private ConsumableSubject type;
    private  int quantity;

    public ConsumableEntity(ConsumableSubject type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }
}
