package com.maimai.tamagotchi.service.implementation;

import com.maimai.tamagotchi.TamagotchiLauncher;
import com.maimai.tamagotchi.service.IService;

import javax.inject.Inject;


public class StorageServiceImpl implements IService {
    @Inject
    private TamagotchiLauncher tamagotchiLauncher;

    @Override
    public void start() {
        System.out.println("Waiting for results");
    }

    @Override
    public void interrupt() {
        System.out.println(" > Shutting down " + getClass().getName());
    }
}
