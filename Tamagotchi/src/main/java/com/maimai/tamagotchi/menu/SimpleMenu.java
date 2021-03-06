package com.maimai.tamagotchi.menu;

import com.maimai.tamagotchi.api.manager.Manager;
import com.maimai.tamagotchi.api.menu.Menu;
import com.maimai.tamagotchi.manager.SimpleManager;

public abstract class SimpleMenu implements Menu {

    private final Manager<Byte, MenuOption> menuOptionManager;

    public SimpleMenu() {
        this.menuOptionManager = new SimpleManager<>();
    }

    @Override
    public Manager<Byte, MenuOption> getOptionManager() {
        return menuOptionManager;
    }
}