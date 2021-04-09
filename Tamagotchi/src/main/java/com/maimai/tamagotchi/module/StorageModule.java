package com.maimai.tamagotchi.module;

import com.maimai.tamagotchi.mascot.subject.ConsumableSubject;
import com.maimai.tamagotchi.storage.IStorage;
import com.maimai.tamagotchi.storage.implementation.ConsumableStorage;
import me.yushust.inject.AbstractModule;
import me.yushust.inject.key.TypeReference;

public class StorageModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(new TypeReference<IStorage<ConsumableSubject, Integer>>() {
        }).named("consumable-manager").to(ConsumableStorage.class).singleton();
    }
}
