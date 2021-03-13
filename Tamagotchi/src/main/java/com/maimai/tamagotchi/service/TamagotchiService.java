package com.maimai.tamagotchi.service;

import com.maimai.tamagotchi.api.service.Service;
import com.maimai.tamagotchi.manager.GameSessionManager;
import com.maimai.tamagotchi.api.manager.Manager;
import com.maimai.tamagotchi.session.GameSession;
import com.maimai.tamagotchi.api.user.UserModel;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TamagotchiService implements Service {

    private final Map<Class<? extends Service>, Service> services;

    private final Manager<String, GameSession> gameSessionManager;

    private final UserModel userModel;

    public TamagotchiService() {
        this.services = new HashMap<>();
        this.services.put(TerminalService.class, new TerminalService(this));

        this.gameSessionManager = new GameSessionManager(new File("saved games"));

        this.userModel = new UserModel();
    }

    public void start() {
        services.values().forEach(Service::start);
    }

    public void stop() {
        services.values().forEach(Service::stop);
    }

    @SuppressWarnings("unchecked")
    public <T extends Service> T getService(Class<T> tClass) {
        return (T) services.get(tClass);
    }

    public UserModel getUser() {
        return userModel;
    }
}