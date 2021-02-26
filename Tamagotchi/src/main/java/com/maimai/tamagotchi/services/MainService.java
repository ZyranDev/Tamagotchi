package com.maimai.tamagotchi.services;

import org.reflections.Reflections;

import java.util.HashSet;
import java.util.Set;

public class MainService {

    private Set<Service> services;

    public MainService() {
        services = new HashSet<>();
        Reflections reflections = new Reflections("com.maimai.tamagotchi.services");
        reflections.getSubTypesOf(Service.class).forEach(serviceClass -> {
            try {
                services.add(serviceClass.newInstance());
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        });
    }

    public void start() {
        services.forEach(Service::start);
    }

    public void stop() {
        services.forEach(Service::stop);
    }
}