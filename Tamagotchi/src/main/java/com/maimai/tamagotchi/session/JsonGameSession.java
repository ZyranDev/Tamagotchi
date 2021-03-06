package com.maimai.tamagotchi.session;

import com.google.gson.Gson;
import com.maimai.tamagotchi.mascot.entity.MascotEntity;
import com.maimai.tamagotchi.util.JsonFile;
import com.maimai.tamagotchi.util.serialization.SerializationUtils;

public class JsonGameSession implements GameSession {

    private final JsonFile jsonFile;
    private MascotEntity mascotEntity;

    public JsonGameSession(JsonFile jsonFile) {
        this.jsonFile = jsonFile;
    }

    @Override
    public void loadGameSession() {
        Gson gson = SerializationUtils.getGSON();
        try {

        } catch (Exception e) {

        }
    }

    @Override
    public void save() {

    }
}