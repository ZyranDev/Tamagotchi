package com.maimai.tamagotchi;

import com.maimai.tamagotchi.service.TamagotchiService;

public class TamagotchiLauncher {

    public static void main(String[] args) {
        new TamagotchiService().start();
    }
}