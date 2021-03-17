package com.maimai.tamagotchi;

import com.maimai.tamagotchi.entity.action.implementations.DogAction;
import com.maimai.tamagotchi.service.TamagotchiService;

public class TamagotchiLauncher {

    public static void main(String[] args) {
        DogAction actionModel = new DogAction();
        actionModel.printAll();
        new TamagotchiService().start();
    }
}