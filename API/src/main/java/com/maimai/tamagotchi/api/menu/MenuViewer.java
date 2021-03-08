package com.maimai.tamagotchi.api.menu;

import java.util.Optional;

public interface MenuViewer {

    void openMenu(Menu menu);

    Optional<Menu> previousMenu();
}