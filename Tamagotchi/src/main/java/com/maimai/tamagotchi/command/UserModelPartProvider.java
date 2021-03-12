package com.maimai.tamagotchi.command;

import com.maimai.tamagotchi.api.command.CommandArgumentManager;
import com.maimai.tamagotchi.api.command.CommandPartProvider;
import com.maimai.tamagotchi.service.TamagotchiService;

public class UserModelPartProvider implements CommandPartProvider {

    private final TamagotchiService tamagotchiService;

    public UserModelPartProvider(TamagotchiService tamagotchiService) {
        this.tamagotchiService = tamagotchiService;
    }

    @Override
    public void configure(CommandArgumentManager provider) {
        provider.addArgument("userModel", tamagotchiService.getUser());
    }
}