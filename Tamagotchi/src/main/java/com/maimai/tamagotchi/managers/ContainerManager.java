package com.maimai.tamagotchi.managers;

import com.maimai.tamagotchi.utils.Cache;

public class ContainerManager extends Cache<Class<?>, Object> {

    public void addInstance(Class<?> clazz, Object object) {
        getCache().put(clazz, object);
    }

    public void addInstance(Class<?> clazz) {
        try {
            addInstance(clazz, clazz.newInstance());
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public <T> T getInstance(Class<?> clazz) {
        return (T) getCache().get(clazz);
    }
}