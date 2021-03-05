package com.maimai.tamagotchi;

import com.maimai.tamagotchi.services.Menu;

public class TamagotchiLauncher {

    //    0 a 1 r c d e f 9 l n o

    public static void main(String[] args) {
        // Just a test;
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);

        Menu menu = new Menu();
        menu.start();
    }
}