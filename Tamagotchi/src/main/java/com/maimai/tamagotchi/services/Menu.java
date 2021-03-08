package com.maimai.tamagotchi.services;

import com.maimai.tamagotchi.api.service.IService;
import com.maimai.tamagotchi.menu.LoginMenu;

public class Menu implements IService {
    LoginMenu loginMenu = new LoginMenu();

    public void start() {
        loginMenu.displayMenu();
    }

    public void stop() {
        return;
    }
}
