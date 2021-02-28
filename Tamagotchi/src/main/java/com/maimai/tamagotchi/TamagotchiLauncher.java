package com.maimai.tamagotchi;

import com.maimai.tamagotchi.module.IModule;
import com.maimai.tamagotchi.module.Module;

public class TamagotchiLauncher {

    //    0 a b r c d e f 9 l n o

    public static void main(String[] args) {
        IModule module = new Module();
        module.start();
    }
}