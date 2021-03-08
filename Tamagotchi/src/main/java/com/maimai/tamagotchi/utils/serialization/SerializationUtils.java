package com.maimai.tamagotchi.utils.serialization;

import com.google.gson.Gson;

public class SerializationUtils {

    private final static Gson GSON = new Gson();

    public static Gson getGSON() {
        return GSON;
    }
}