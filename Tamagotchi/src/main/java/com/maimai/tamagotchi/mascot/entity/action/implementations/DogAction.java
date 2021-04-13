package com.maimai.tamagotchi.mascot.entity.action.implementations;

import com.maimai.tamagotchi.mascot.entity.action.ActionModel;
import com.maimai.tamagotchi.util.console.Console;

public class DogAction implements ActionModel {
    /* Default actions */
    @Override
    public void drinkAction() {
        Console.print(
                "           ___",
                "        __/_  `.  .-\"\"\"-.",
                "        \\_,` | \\-'  /   )`-')",
                "         \"\") `\"`    \\  ((`\"`",
                " ___     __Y  ,    .'7 /|",
                "/___\\  (_,___/...-` (_/_/\n",
                "&c&lGlup, glup, goof! &r🐕"
        );
    }

    @Override
    public void eatAction() {
        Console.print(
                "           ___",
                "        __/_  `.  .-\"\"\"-.",
                "        \\_,` | \\-'  /   )`-')",
                "         \"\") `\"`    \\  ((`\"`",
                " ___     __Y  ,    .'7 /|",
                "/___\\  (_,___/...-` (_/_/\n",
                "&c&l* Crak, crak, hmm ñumy *, &r🐩"
        );
    }

    @Override
    public void jumpAction() {
        Console.print(
                "                  ;~~,__",
                "   :-....,-------'`-'._.'",
                "    `-,,,  ,       ;'~~'",
                "       ,'_,'~.__; '--.",
                "      //'       ````(;",
                "     `-' \n",
                "&c&lSlash amazing jump! &r🐕");
    }

    @Override
    public void runAction() {
        Console.print(
                "             .--~~,__",
                ":-....,-------`~~'._.'",
                " `-,,,  ,_      ;'~U'",
                "  _,-' ,'`-__; '--.",
                " (_/'~~      ''''(;\n",
                "&c&lFium ur dog has been running! &r🦮");
    }

    @Override
    public void sleepAction() {
        Console.print(
                "                __",
                "               /\\/'-,",
                "       ,--'''''   /\"",
                " ____,'.  )       \\___",
                "'\"\"\"\"\"------'\"\"\"`-----'\n",
                "&c&lZ z z... &r🐶"
        );
    }

    /* Special  actions */
    public void barkAction() {
        Console.print(
                "                  ;~~,__",
                "   :-....,-------'`-'._.'",
                "    `-,,,  ,       ,'~~'",
                "        ; ,'~.__; /--.",
                "        :| :|   :|``(;",
                "        `-'`-'  `-'\n",
                "&c&lGuaf, woof, grrr! &r🐕"
        );
    }

    public void spinAroundAction() {
        Console.print(
                "                _,)",
                "        _..._.-;-'",
                "     .-'     `(",
                "    /      ;   \\",
                "   ;.' ;`  ,;  ;",
                "  .'' ``. (  \\ ;",
                " / f_ _L \\ ;  )\\",
                " \\/|` '|\\/;; <;/",
                "((; \\_/  (()",
                "     \"\n",
                "&c&lGrr, woof &r🐕‍"
        );
    }

    public void printAll() {
        eatAction();
        drinkAction();
        jumpAction();
        runAction();
        sleepAction();
        barkAction();
        spinAroundAction();
    }
}
