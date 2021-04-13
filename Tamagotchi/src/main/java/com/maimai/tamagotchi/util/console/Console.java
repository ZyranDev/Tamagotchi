package com.maimai.tamagotchi.util.console;

import java.util.Scanner;

public class Console {

    public Scanner scanner = new Scanner(System.in);

    public static void print(String... text) {
        for (String str : text) {
            System.out.println(ChatColor.translateColorCodes(str));
        }
    }

    public static void clearConsole() {
        for (byte i = 0; i < 40; i++) {
            System.out.println(ChatColor.translateColorCodes("&r"));
            i++;
        }
    }
}
