package com.maimai.tamagotchi.services;

import com.maimai.tamagotchi.api.loader.ILoader;
import com.maimai.tamagotchi.api.service.IService;
import org.reflections.Reflections;

import java.util.HashSet;
import java.util.Set;

public class LoaderService implements IService {

    /*
     * According to me, this class is unnecessary in addition to being a bit poorly optimized by the theme
     * of the reflection, plus there really are few services and 1.
     * is much easier and more efficient to do it by hand,
     * instead of doing it this way, or so I think,
     * if it is possible to eliminate this class, I do not do it without consulting others.
     */

    private final Set<ILoader> services;

    public LoaderService() {
        services = new HashSet<>();
        Reflections reflections = new Reflections("com.maimai.tamagotchi.services");
        reflections.getSubTypesOf(ILoader.class).forEach(loaderClass -> {
            try {
                services.add(loaderClass.newInstance());
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        });
    }

    @Override
    public void start() {
        services.forEach(ILoader::load);
    }

    @Override
    public void stop() {
        services.forEach(ILoader::load);
    }
}