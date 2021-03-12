package com.maimai.tamagotchi.api.user;

import com.maimai.tamagotchi.api.menu.Menu;
import com.maimai.tamagotchi.api.menu.MenuViewer;

import java.util.Optional;

public class UserModel implements MenuViewer {

    private Menu previousMenu;

    private Menu currentMenu;

    @Override
    public void openMenu(Menu menu) {
        if (currentMenu != null) {
            previousMenu = currentMenu;
        }

        this.currentMenu = menu;
        menu.displayMenu();
    }

    @Override
    public Optional<Menu> previousMenu() {
        return Optional.ofNullable(previousMenu);
    }
}