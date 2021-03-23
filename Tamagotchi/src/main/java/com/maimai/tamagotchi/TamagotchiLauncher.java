package com.maimai.tamagotchi;

import com.maimai.tamagotchi.menu.MainMenu;
import com.maimai.tamagotchi.session.implementation.GameSessionJson;

import java.io.File;

public class TamagotchiLauncher {

    public static void main(String[] args) {
        GameSessionJson gameSessionJson = new GameSessionJson(new File("saved games"));
        gameSessionJson.onCreate();
        new MainMenu().displayMenu();
    }
}