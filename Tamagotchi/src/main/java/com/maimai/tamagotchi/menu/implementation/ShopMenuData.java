package com.maimai.tamagotchi.menu.implementation;

import com.maimai.tamagotchi.manager.ConsumableManager;
import com.maimai.tamagotchi.mascot.subject.ConsumableSubject;
import me.yushust.inject.InjectAll;

@InjectAll
public class ShopMenuData {
    
    private ConsumableManager consumableManager;

    public void setCurrency(int value) {
        consumableManager.setConsumableValue(ConsumableSubject.MONEY, value);
    }

    public void removeCurrency() {
        consumableManager.removeConsumableValue(ConsumableSubject.MONEY);
    }

    public int getCurrency() {
        return consumableManager.getConsumableValue(ConsumableSubject.MONEY);
    }
}
