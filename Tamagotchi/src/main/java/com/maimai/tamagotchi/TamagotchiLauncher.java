package com.maimai.tamagotchi;

import com.maimai.tamagotchi.consumable.implementation.MoneyConsumable;
import com.maimai.tamagotchi.service.TamagotchiService;

public class TamagotchiLauncher {

    public static void main(String[] args) {
        MoneyConsumable consumable = new MoneyConsumable();
        consumable.moneySerialize();
        new TamagotchiService().start();
    }
}