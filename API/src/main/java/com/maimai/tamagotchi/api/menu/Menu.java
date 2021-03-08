package com.maimai.tamagotchi.api.menu;

import com.maimai.tamagotchi.api.manager.Manager;

import java.util.function.Consumer;

public interface Menu {

    Manager<Byte, MenuOption> getOptionManager();

    void displayMenu();

    Consumer<String> listener();

    @FunctionalInterface
    interface MenuOption {

        void call();

    }
}