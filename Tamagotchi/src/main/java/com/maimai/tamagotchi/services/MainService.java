package com.maimai.tamagotchi.services;

import org.reflections.Reflections;

import java.util.HashSet;
import java.util.Set;

public class MainService {

    /*
     * According to me, this class is unnecessary in addition to being a bit poorly optimized by the theme
     * of the reflection, plus there really are few services and 1.
     * is much easier and more efficient to do it by hand,
     * instead of doing it this way, or so I think,
     * if it is possible to eliminate this class, I do not do it without consulting others.
     */

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