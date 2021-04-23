package com.maimai.tamagotchi.util.console;

import java.util.Scanner;

public class Console {

    public Scanner scanner = new Scanner(System.in);

    /**
     * <p>
     * Console.print translate color codes & print array as list
     * </p>
     *
     * @param text - Accept the input of an array as list (String)
     * @return print strings from text & translate it color codes
     * @see ChatColor
     */

    public static void print(String... text) {
        for (String str : text) {
            System.out.println(ChatColor.translateColorCodes(str));
        }
    }

    /**
     * @return 80 reset lines from ChatColor
     * @see ChatColor
     */

    public static void clearConsole() {
        for (byte i = 0; i < 80; i++) {
            System.out.println(ChatColor.translateColorCodes("&r"));
            i++;
        }
    }
}
