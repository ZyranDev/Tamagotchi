package com.maimai.tamagotchi.module;

import com.maimai.tamagotchi.service.IService;
import com.maimai.tamagotchi.service.implementation.MenuServiceImpl;
import com.maimai.tamagotchi.service.implementation.StorageServiceImpl;
import com.maimai.tamagotchi.service.implementation.TamagotchiServiceImpl;
import me.yushust.inject.AbstractModule;

public class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(IService.class).named("menu-service").to(MenuServiceImpl.class).singleton();
        bind(IService.class).named("storage-service").to(StorageServiceImpl.class).singleton();
        bind(IService.class).named("tamagotchi-service").to(TamagotchiServiceImpl.class).singleton();
    }
}
