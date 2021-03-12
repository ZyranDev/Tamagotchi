package com.maimai.tamagotchi.api.command.manager;

import com.maimai.tamagotchi.api.command.CommandArgumentManager;

import java.util.*;

public class CommandArgumentManagerImpl implements CommandArgumentManager {

    private final Map<String, Map<Class<?>, Object>> argumentObjectManager;

    public CommandArgumentManagerImpl() {
        this.argumentObjectManager = new LinkedHashMap<>();
    }

    public CommandArgumentManagerImpl(String... commandArgs) {
        this();

        for (int i = 0; i < commandArgs.length; i++) {
            addArgument(i+"", commandArgs[i]);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T get(Class<T> tClass, String argumentName) {
        Map<Class<?>, Object> objectMap = argumentObjectManager.get(argumentName);

        if (objectMap == null)
            return null;

        return (T) objectMap.get(tClass);
    }

    @Override
    public boolean exists(String argumentName, Class<?> tClass) {
        Map<Class<?>, Object> objectMap = argumentObjectManager.get(argumentName);

        if (objectMap == null)
            return false;

        return objectMap.get(tClass) != null;
    }

    @Override
    public String[] getArguments() {
        List<String> stringList = new ArrayList<>();
        for (Map<Class<?>, Object> value : argumentObjectManager.values()) {
            for (Object o : value.values()) {
                stringList.add(o.toString());
            }
        }
        return stringList.toArray(new String[0]);
    }

    @Override
    public void addArgument(String key, Object value) {
        Map<Class<?>, Object> objectMap;

        if (argumentObjectManager.containsKey(key)) {
            objectMap = argumentObjectManager.get(key);
        } else {
            objectMap = new HashMap<>();
            argumentObjectManager.put(key, objectMap);
        }

        objectMap.put(value.getClass(), value);
    }
}