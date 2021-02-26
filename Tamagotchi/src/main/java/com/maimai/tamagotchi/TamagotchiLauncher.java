package com.maimai.tamagotchi;

import com.maimai.tamagotchi.module.Module;
import com.maimai.tamagotchi.module.IModule;

public class TamagotchiLauncher {
    public static void main(String[] args) {
        IModule module = new Module();
        module.start();
    }
}