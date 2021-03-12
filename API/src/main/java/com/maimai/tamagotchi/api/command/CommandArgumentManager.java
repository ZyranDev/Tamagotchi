package com.maimai.tamagotchi.api.command;

import java.util.Arrays;
import java.util.Optional;

public interface CommandArgumentManager {

    <T> T get(Class<T> tClass, String argumentName);

    boolean exists(String argumentName, Class<?> tClass);

    String[] getArguments();

    default String[] getArguments(int from) {
        String[] args = getArguments();
        return Arrays.copyOfRange(args, from, args.length);
    }

    default String get(String argumentName) {
        return get(String.class, argumentName);
    }

    void addArgument(String key, Object value);

    default <T> Optional<T> getOptional(Class<T> tClass, String argumentName) {
        return Optional.ofNullable(get(tClass, argumentName));
    }
}