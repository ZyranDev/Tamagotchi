package com.maimai.tamagotchi.consumable.base;

import com.maimai.tamagotchi.consumable.subject.ConsumableSubject;

import java.util.List;

public class ConsumableEntity {
    List<ConsumableItem> consumables;

    public ConsumableEntity(List<ConsumableItem> consumables) {
        this.consumables = consumables;
    }

    public static class ConsumableItem {
        ConsumableSubject subject;
        private int quantity;

        public ConsumableItem(ConsumableSubject subject, int quantity) {
            this.subject = subject;
            this.quantity = quantity;
        }
    }
}
