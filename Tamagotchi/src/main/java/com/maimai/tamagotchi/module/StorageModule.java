package com.maimai.tamagotchi.module;

import com.maimai.tamagotchi.mascot.subject.ConsumableSubject;
import com.maimai.tamagotchi.util.cache.ICache;
import com.maimai.tamagotchi.util.cache.implementation.ConsumableCache;
import me.yushust.inject.AbstractModule;
import me.yushust.inject.key.TypeReference;

public class StorageModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(new TypeReference<ICache<ConsumableSubject, Integer>>() {
        }).named("consumable-cache").to(ConsumableCache.class).singleton();
    }
}
