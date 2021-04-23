package com.maimai.tamagotchi.service.implementation;

import com.maimai.tamagotchi.TamagotchiLauncher;
import com.maimai.tamagotchi.api.user.UserModel;
import com.maimai.tamagotchi.service.IService;
import com.maimai.tamagotchi.util.console.ChatColor;
import me.yushust.inject.InjectAll;

import javax.inject.Named;

@InjectAll
public class TamagotchiServiceImpl implements IService {
    private TamagotchiLauncher tamagotchiLauncher;
    private UserModel userModel;

    @Named("menu-service")
    private MenuServiceImpl menuService;

    @Named("storage-service")
    private StorageServiceImpl storageService;

    @Override
    public void start() {
        System.out.println(ChatColor.translateColorCodes("&r> Initializing " + Thread.currentThread().getName()));
        menuService.start();
    }

    @Override
    public void interrupt() {
        System.out.println("> Shutting down " + Thread.currentThread().getName());
    }
}
