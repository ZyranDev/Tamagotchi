package com.maimai.tamagotchi.manager;

import com.maimai.tamagotchi.mascot.subject.ConsumableSubject;
import com.maimai.tamagotchi.storage.implementation.ConsumableStorage;
import me.yushust.inject.InjectAll;

import javax.inject.Named;

@InjectAll
public class ConsumableManager {

    @Named("consumable-manager")
    private ConsumableStorage consumableStorage;

    public void setConsumableValue(ConsumableSubject subject, int value) {
        consumableStorage.addValue(subject, value);
    }

    public void removeConsumableValue(ConsumableSubject subject) {
        consumableStorage.removeValue(subject);
    }

    public void findConsumableValue(ConsumableSubject subject) {
        consumableStorage.find(subject);
    }

    public int getConsumableValue(ConsumableSubject subject) {
        return consumableStorage.getValue(subject);
    }

    public boolean existsConsumableValue(ConsumableSubject subject) {
        return consumableStorage.exists(subject);
    }
}
