package com.maimai.tamagotchi;

import com.maimai.tamagotchi.entity.action.implementations.CatAction;
import com.maimai.tamagotchi.entity.action.implementations.DogAction;
import com.maimai.tamagotchi.entity.action.implementations.LionAction;
import com.maimai.tamagotchi.service.TamagotchiService;

public class TamagotchiLauncher {

    public static void main(String[] args) {
        /* ASCII art test */
        new DogAction().printAll();
        new CatAction().printAll();
        new LionAction().sleepAction();

        new TamagotchiService().start();
    }
}