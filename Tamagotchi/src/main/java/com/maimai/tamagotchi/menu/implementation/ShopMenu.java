package com.maimai.tamagotchi.menu.implementation;

import com.maimai.tamagotchi.mascot.subject.ConsumableSubject;
import com.maimai.tamagotchi.menu.SimpleMenu;
import com.maimai.tamagotchi.menu.data.ShopMenuData;
import com.maimai.tamagotchi.util.console.Console;
import me.yushust.inject.InjectAll;

import java.util.function.Consumer;

@InjectAll
public class ShopMenu extends SimpleMenu {

    private ShopMenuData shopMenuData;

    private void usageCurrency(ConsumableSubject subject) {
        shopMenuData.getCurrency();
    }

    @Override
    public void displayMenu() {
        shopMenuData.setCurrency(100);
        Console.clearConsole();
        Console.print("&cActual balance: " + shopMenuData.getCurrency());
    }

    @Override
    public Consumer<String> listener() {
        return null;
    }
}
