package com.maimai.tamagotchi;

import com.maimai.tamagotchi.menu.MainMenu;
import com.maimai.tamagotchi.menu.implementation.StartMenuData;

import java.io.File;

public class TamagotchiLauncher {
    /**
     * Well, as I said before, the tamagotchi has been TOTALLY modified,
     * also the @param {StartMenuData} zone will be changed, and the MainMenu zone data will be added,
     * so all the data will be saved correctly.
     */

    public static void main(String[] args) {
        StartMenuData startMenuData = new StartMenuData(new File("saved games"));
        startMenuData.onLoad();
        new MainMenu().displayMenu();
    }
}