package com.maimai.tamagotchi.service.implementation;

import com.maimai.tamagotchi.api.user.UserModel;
import com.maimai.tamagotchi.service.IService;
import me.yushust.inject.InjectAll;

import javax.inject.Named;

@InjectAll
public class TamagotchiServiceImpl implements IService {
    private UserModel userModel;

    @Named("menu-service")
    private MenuServiceImpl menuService;

    @Named("storage-service")
    private StorageServiceImpl storageService;

    @Override
    public void start() {
        System.out.println("> Initialized " + Thread.currentThread().getName());
        // storageService.start();
        menuService.start();
    }

    @Override
    public void interrupt() {
        System.out.println("> Shutting down " + Thread.currentThread().getName());
    }
}
