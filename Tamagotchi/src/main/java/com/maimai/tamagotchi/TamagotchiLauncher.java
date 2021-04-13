package com.maimai.tamagotchi;

import com.maimai.tamagotchi.module.MainModule;
import com.maimai.tamagotchi.service.implementation.TamagotchiServiceImpl;
import me.yushust.inject.Injector;

import javax.inject.Inject;
import javax.inject.Named;

public class TamagotchiLauncher {

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