package com.maimai.tamagotchi.entity.action.implementations;

import com.maimai.tamagotchi.entity.action.ActionModel;
import com.maimai.tamagotchi.utils.console.ArrayPrintln;

public class CatAction implements ActionModel {
    /* Default actions */
    @Override
    public void drinkAction() {
        ArrayPrintln.print(
                "                _ |\\_",
                "                \\` ..\\",
                "           __,.-\" =__Y=",
                "         .\"        )",
                "   _    /   ,    \\/\\_",
                "  ((____|    )_-\\ \\_-`    ___",
                "  `-----'`-----` `--`    /___\\\n",
                "&c&lGlup, glup, yummy! &r🐱"
        );
    }

    @Override
    public void eatAction() {
        ArrayPrintln.print(
                "                _ |\\_",
                "                \\` ..\\",
                "           __,.-\" =__Y=",
                "         .\"        )",
                "   _    /   ,    \\/\\_",
                "  ((____|    )_-\\ \\_-`    ___",
                "  `-----'`-----` `--`    /___\\\n",
                "&c&lÑam, ñam, yummy! &r🐱"
        );
    }

    @Override
    public void jumpAction() {
        ArrayPrintln.print(
                "            _,'|             _.-''``-...___..--';)",
                "           /_ \\'.      __..-' ,      ,--...--'''",
                "          <\\    .`--'''       `     /'",
                "           `-';'               ;   ; ;",
                "     __...--''     ___...--_..'  .;.'",
                "    (,__....----'''       (,..--''   \n",
                "&c&lWow it was an incredible jump! &r🐱"
        );
    }

    @Override
    public void runAction() {
        ArrayPrintln.print(
                "                        _",
                "                       | \\",
                "                       | |",
                "                       | |",
                "  |\\                   | |",
                " /, ~\\                / /",
                "X     `-.....-------./ /",
                " ~-. ~  ~              |",
                "    \\             /    |",
                "     \\  /_     ___\\   /",
                "     | /\\ ~~~~~   \\ |",
                "     | | \\        || |",
                "     | |\\ \\       || )",
                "    (_/ (_/      ((_/\n",
                "&c&lFium, what speed! &r🐱"
        );
    }

    @Override
    public void sleepAction() {
        ArrayPrintln.print(
                "      |\\      _,,,---,,_",
                "ZZZzz /,`.-'`'    -.  ;-;;,_",
                "     |,4-  ) )-,_. ,\\ (  `'-'",
                "    '---''(_/--'  `-'\\_)\n",
                "&c&lZ z z... &r🐱"
        );
    }

    /* Special actions */
    public void purrAction() {
        ArrayPrintln.print(
                "           .               ,.",
                "          T.\"-._..---.._,-\"/|",
                "          l|\"-.  _.v._   (\" |",
                "          [l /.'_ \\; _~\"-.`-t",
                "          Y \" _(o} _{o)._ ^.|",
                "          j  T  ,--.  T  ]",
                "          \\  l ( /-^-\\ ) !  !",
                "           \\. \\.  \"~\"  ./  /c-..,__",
                "             ^r- .._ .- .-\"  `- .  ~\"--.",
                "              > \\.                      \\",
                "              ]   ^.                     \\",
                "              3  .  \">            .       Y  -Row",
                " ,.__.--._   _j   \\ ~   .         ;       |",
                "(    ~\"-._~\"^._\\   ^.    ^._      I     . l",
                " \"-._ ___ ~\"-,_7    .Z-._   7\"   Y      ;  \\        _",
                "    /\"   \"~-(r r  _/_--._~-/    /      /,.--^-._   / Y",
                "    \"-._    '\"~~~>-._~]>--^---./____,.^~        ^.^  !",
                "        ~--._    '   Y---.                        \\./",
                "             ~~--._  l_   )                        \\",
                "                   ~-._~~~---._,____..---           \\",
                "                       ~----\"~       \\",
                "                                      \\\n",
                "&c&lNya, grr, meow.. &r🐱"
        );
    }

    public void searchAction() {
        ArrayPrintln.print(
                "  ,-.       _,---._ __  / \\",
                " /  )    .-'       `./ /   \\",
                "(  (   ,'            `/    /|",
                " \\  `-\"             \\'\\   / |",
                "  `.              ,  \\ \\ /  |",
                "   /`.          ,'-`----Y   |",
                "  (            ;        |   '",
                "  |  ,-.    ,-' Akardo  |  /",
                "  |  | (   |    devcamp | /",
                "  )  |  \\  `.___________|/",
                "  `--'   `--'\n",
                "&c&lMeow i'm currently searching! &r🐈"
        );
    }

    public void printAll() {
        drinkAction();
        eatAction();
        jumpAction();
        runAction();
        sleepAction();
        purrAction();
        searchAction();
    }
}
