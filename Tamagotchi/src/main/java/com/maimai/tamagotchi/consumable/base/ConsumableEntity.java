package com.maimai.tamagotchi.consumable.base;

import com.google.gson.annotations.SerializedName;
import com.maimai.tamagotchi.consumable.subject.ConsumableSubject;

public class ConsumableEntity {
    @SerializedName("subject")
    private ConsumableSubject type;
    @SerializedName("value")
    private  int quantity;

    public ConsumableEntity(ConsumableSubject type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }
}
