package com.maimai.tamagotchi;

import com.maimai.tamagotchi.api.command.Command;
import com.maimai.tamagotchi.api.command.CommandManager;
import com.maimai.tamagotchi.consumable.base.Consumable;
import com.maimai.tamagotchi.consumable.subject.ConsumableSubject;
import com.maimai.tamagotchi.entity.action.implementations.CatAction;
import com.maimai.tamagotchi.entity.action.implementations.DogAction;
import com.maimai.tamagotchi.entity.action.implementations.LionAction;
import com.maimai.tamagotchi.manager.ConsumableManager;
import com.maimai.tamagotchi.service.TamagotchiService;
import com.maimai.tamagotchi.service.TerminalService;
import com.maimai.tamagotchi.utils.console.ArrayPrintln;

import java.io.File;

public class TamagotchiLauncher {

    public static void main(String[] args) {
        /* ASCII art test */
        new DogAction().printAll();
        new CatAction().printAll();
        new LionAction().sleepAction();
        new Consumable(new File("saved games")).onCreate();

        TamagotchiService tamagotchiService = new TamagotchiService();
        tamagotchiService.start();
        TerminalService terminalService = tamagotchiService.getService(TerminalService.class);
        CommandManager commandManager = terminalService.getCommandManager();

        Command command = (manager) -> {
            ConsumableManager moneyManager = new ConsumableManager();
            moneyManager.addMoney(ConsumableSubject.MONEY, 100);
            System.out.println(moneyManager.getMoney(ConsumableSubject.MONEY));
            ArrayPrintln.print(
                    "",
                    "&a&lAll data has been saved&r",
                    ""
            );
            return null;
        };

        commandManager.registerCommand("save-all", command);
    }
}