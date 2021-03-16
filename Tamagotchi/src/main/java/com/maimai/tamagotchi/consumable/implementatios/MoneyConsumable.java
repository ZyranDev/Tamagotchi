package com.maimai.tamagotchi.consumable.implementatios;

import com.maimai.tamagotchi.consumable.base.Consumable;
import com.maimai.tamagotchi.consumable.subject.ConsumableSubject;

public class MoneyConsumable {
    public void moneySerialize() {
        Consumable consumable = new Consumable();
        consumable.addConsumable(ConsumableSubject.MONEY, 100);
        consumable.addConsumable(ConsumableSubject.MONEY, 600);
    }
}