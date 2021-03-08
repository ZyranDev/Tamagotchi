package com.maimai.tamagotchi.service;

import com.maimai.tamagotchi.api.service.Service;
import com.maimai.tamagotchi.manager.GameSessionManager;
import com.maimai.tamagotchi.api.manager.Manager;
import com.maimai.tamagotchi.session.GameSession;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class TamagotchiService implements Service {

    private final Set<Service> services;

    private final Manager<String, GameSession> gameSessionManager;

    public TamagotchiService() {
        this.services = new HashSet<>();
        this.gameSessionManager = new GameSessionManager(new File("saved games"));
    }

    public void start() {
        services.forEach(Service::start);
    }

    public void stop() {
        services.forEach(Service::stop);
    }
}