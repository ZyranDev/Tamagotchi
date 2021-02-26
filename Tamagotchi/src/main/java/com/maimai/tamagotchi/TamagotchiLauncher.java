package com.maimai.tamagotchi;

import com.maimai.tamagotchi.managers.ContainerManager;
import com.maimai.tamagotchi.utils.console.Console;

public class TamagotchiLauncher {

    private static ContainerManager containerManager;

    public TamagotchiLauncher() {
        containerManager = new ContainerManager();
        containerManager.addInstance(Console.class);
    }

    public static void main(String[] args) {
        new TamagotchiLauncher();
    }

    public static <T> T getInstance(Class<?> clazz) {
        return containerManager.getInstance(clazz);
    }
}