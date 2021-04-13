package com.maimai.tamagotchi.menu.data;

import com.maimai.tamagotchi.mascot.subject.ConsumableSubject;
import com.maimai.tamagotchi.storage.implementation.ConsumableStorage;
import me.yushust.inject.InjectAll;

import javax.inject.Named;

@InjectAll
public class ShopMenuData {

    @Named("consumable-manager")
    private ConsumableStorage consumableStorage;

    public void findCurrency() {
        consumableStorage.find(ConsumableSubject.MONEY);
    }

    public void setCurrency(int value) {
        consumableStorage.addValue(ConsumableSubject.MONEY, value);
    }

    public void removeCurrency() {
        consumableStorage.removeValue(ConsumableSubject.MONEY);
    }

    public int getCurrency() {
        return consumableStorage.getValue(ConsumableSubject.MONEY);
    }
}
