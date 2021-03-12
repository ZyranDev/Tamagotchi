package com.maimai.tamagotchi.service;

import com.maimai.tamagotchi.api.command.CommandManager;
import com.maimai.tamagotchi.api.command.manager.SimpleCommandManager;
import com.maimai.tamagotchi.api.service.Service;
import com.maimai.tamagotchi.command.UserModelPartProvider;
import com.maimai.tamagotchi.manager.GameSessionManager;
import com.maimai.tamagotchi.api.manager.Manager;
import com.maimai.tamagotchi.session.GameSession;
import com.maimai.tamagotchi.api.user.UserModel;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class TamagotchiService implements Service {

    private final Set<Service> services;

    private final Manager<String, GameSession> gameSessionManager;

    private final UserModel userModel;

    public TamagotchiService() {
        this.services = new HashSet<>();
        this.services.add(new TerminalService(this));

        this.gameSessionManager = new GameSessionManager(new File("saved games"));

        this.userModel = new UserModel();
    }

    public void start() {
        services.forEach(Service::start);
    }

    public void stop() {
        services.forEach(Service::stop);
    }

    public UserModel getUser() {
        return userModel;
    }
}