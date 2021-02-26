package com.maimai.tamagotchi.services;

import com.maimai.tamagotchi.loaders.Loader;
import org.reflections.Reflections;

import java.util.HashSet;
import java.util.Set;

public class LoaderService implements Service {

    private final Set<Loader> services;

    public LoaderService() {
        services = new HashSet<>();
        Reflections reflections = new Reflections("com.maimai.tamagotchi.services");
        reflections.getSubTypesOf(Loader.class).forEach(loaderClass -> {
            try {
                services.add(loaderClass.newInstance());
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        });
    }

    @Override
    public void start() {
        services.forEach(Loader::load);
    }

    @Override
    public void stop() {
        services.forEach(Loader::load);
    }
}