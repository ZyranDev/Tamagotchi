package com.maimai.tamagotchi;

import com.maimai.tamagotchi.module.MainModule;
import com.maimai.tamagotchi.service.implementation.TamagotchiServiceImpl;
import me.yushust.inject.Injector;

import javax.inject.Inject;
import javax.inject.Named;

public class TamagotchiLauncher {
    /**
     * Well, as I said before, the tamagotchi has been TOTALLY modified,
     * also the @param {StartMenuData} zone will be changed, and the MainMenu zone data will be added,
     * so all the data will be saved correctly.
     */

    @Inject
    @Named("tamagotchi-service")
    private static TamagotchiServiceImpl tamagotchiServiceImpl;

    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("> Initialized " + Thread.currentThread().getName());
        };

        new Thread(runnable).start();

        Thread.currentThread().setName("Thread - Service");

        Injector injector = Injector.create(new MainModule());
        injector.injectStaticMembers(TamagotchiLauncher.class);

        tamagotchiServiceImpl.start();
    }
}