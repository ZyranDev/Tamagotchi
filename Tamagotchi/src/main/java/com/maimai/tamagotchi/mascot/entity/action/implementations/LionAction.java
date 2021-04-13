package com.maimai.tamagotchi.mascot.entity.action.implementations;

import com.maimai.tamagotchi.mascot.entity.action.ActionModel;
import com.maimai.tamagotchi.util.console.Console;

public class LionAction implements ActionModel {
    /* Default actions */
    @Override
    public void drinkAction() {
        System.out.println("this is just a test and is temporal");
    }

    @Override
    public void eatAction() {
        System.out.println("this is just a test and is temporal");
    }

    @Override
    public void jumpAction() {
        System.out.println("this is just a test and is temporal");
    }

    @Override
    public void runAction() {
        System.out.println("this is just a test and is temporal");
    }

    @Override
    public void sleepAction() {
        Console.print(
                "                          ,%%%%%%%,",
                "                        ,%%/\\%%%%/\\%,",
                "                       ,%%%\\c \"\" J/%%,",
                "  %.                   %%%%/ d  b \\%%%",
                "  `%%.         __      %%%%    _  |%%%",
                "   `%%      .-'  `\"~--\"`%%%%(=_Y_=)%%'",
                "    //    .'     `.     `%%%%`\\7/%%%'____",
                "   ((    /         ;      `%%%%%%%'____)))",
                "   `.`--'         ,'   _,`-._____`-,",
                "     `\"\"\"`._____  `--,`          `)))",
                "                `~\"-)))\n",
                "&c&lZ z z... &r🐆"
        );
    }

    /* Special actions */
    public void roarAction() {
        Console.print(
                "               /\\",
                "              ( ;`~v/~~~ ;._",
                "           ,/'\"/^) ' < o\\  '\".~'\\\\\\--,",
                "         ,/\",/W  u '`. ~  >,._..,   )'",
                "        ,/'  w  ,U^v  ;//^)/')/^\\;~)'",
                "     ,/\"'/   W` ^v  W |;         )/'",
                "   ;''  |  v' v`\" W }  \\\\",
                "  \"    .'\\    v  `v/^W,) '\\)\\.)\\/)",
                "           `\\   ,/,)'   ''')/^\"-;'",
                "                   \\\n",
                "&c&lRoar, grrr! &r🐆"
        );
    }

    public void huntAction() {
        Console.print(
                "                       __,,,,_",
                "   _   _ ___.--'''`--''// ,-o `-.",
                "   \\`)' o |  \\  \\ o\\/ /.// / ,-  o,_",
                "  /_`  \\   |o )  | O|. /o// / -.,_o `-.",
                " /<0\\    ) \\  |  | ||/ //o| \\/ O  |`-.o`-._",
                "/  _.-.  .-\\,O__|  _-| /o\\ \\/|_/  |    `-._)",
                "`-\\  \\/ |       /o__/ \\__O / |o_/ |",
                "     `-'       |  -| -|\\__ \\  |-' |",
                "            __/ o /__,-o    ),'o |'",
                "           ((__.-'((____..-' \\__,'\n",
                "* Stealth, sniff, sniff * "
        );
    }
}
