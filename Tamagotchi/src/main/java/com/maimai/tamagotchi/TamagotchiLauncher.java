package com.maimai.tamagotchi;

import com.maimai.tamagotchi.module.MainModule;
import com.maimai.tamagotchi.service.IService;
import me.yushust.inject.Injector;

import javax.inject.Inject;
import javax.inject.Named;

public class TamagotchiLauncher {

    @Inject
    @Named("tamagotchi-service")
    private static IService tamagotchiService;

    public static void main(String[] args) {
        Injector injector = Injector.create(new MainModule());
        injector.injectStaticMembers(TamagotchiLauncher.class);

        tamagotchiService.start();
    }
}