package com.maimai.tamagotchi.utils.console;

public class Console {
    public static void print(String... text) {
        for (String str : text) {
            System.out.println(ChatColor.translateColorCodes(str));
        }
    }
}