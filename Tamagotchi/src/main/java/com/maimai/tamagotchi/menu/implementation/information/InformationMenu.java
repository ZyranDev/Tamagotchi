package com.maimai.tamagotchi.menu.implementation.information;

import com.maimai.tamagotchi.manager.MoneyManager;
import com.maimai.tamagotchi.menu.SimpleMenu;
import com.maimai.tamagotchi.menu.implementation.CreatePetMenu;
import com.maimai.tamagotchi.util.console.Console;
import me.yushust.inject.InjectAll;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.function.Consumer;

@InjectAll
public class InformationMenu extends SimpleMenu {

    private MoneyManager moneyManager;

    @Override
    public void displayMenu() {
        DateFormat dateFormat = new SimpleDateFormat("'Dia' dd 'de' MMMM 'del año' yyyy");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        Console.print("&r",
                "&f&l&oInformación relevante:&r",
                "&f&o",
                "Fecha actual -» " + dateFormat.format(timestamp),
                "Estado de " + CreatePetMenu.getMascotEntity().getName() + " -» Excelente",
                "Dinero de " + CreatePetMenu.getMascotEntity().getOwner() + " -» " + moneyManager.getMoneyCache(),
                "&r");
    }

    @Override
    public Consumer<String> listener() {
        return null;
    }
}
