package com.maimai.tamagotchi.services;

import com.maimai.tamagotchi.loaders.Loader;
import org.reflections.Reflections;

import java.util.HashSet;
import java.util.Set;

public class LoaderService implements Service {

    /*
     * According to me, this class is unnecessary in addition to being a bit poorly optimized by the theme
     * of the reflection, plus there really are few services and 1.
     * is much easier and more efficient to do it by hand,
     * instead of doing it this way, or so I think,
     * if it is possible to eliminate this class, I do not do it without consulting others.
     */

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