package com.maimai.tamagotchi.menu.viewer;

import com.maimai.tamagotchi.api.menu.Menu;
import com.maimai.tamagotchi.api.menu.MenuViewer;

import java.util.Optional;

public class SimpleMenuViewerImpl implements MenuViewer {

    private Menu previousMenu;

    private Menu currentMenu;

    @Override
    public void openMenu(Menu menu) {
        if (currentMenu != null) {
            previousMenu = currentMenu;
        }

        this.currentMenu = menu;
    }

    public static void main(String[] args) {

    }

    @Override
    public Optional<Menu> previousMenu() {
        return Optional.ofNullable(previousMenu);
    }
}