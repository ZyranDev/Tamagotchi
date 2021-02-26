package com.maimai.tamagotchi.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.IOException;

public class Config {

    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private final JsonFile jsonFile;
    private final Object object;

    public Config(File folder, String fileName, Object object) {
        this.jsonFile = new JsonFile(new File(folder, fileName + ((fileName.endsWith(".json")) ? "" : ".json")));
        this.object = object;
    }

    public void saveFile() {
        jsonFile.writeJson(gson.toJson(object));
    }

    public Object loadConfig() throws IOException {
        String json = jsonFile.getJson();
        return gson.fromJson(json, object.getClass());
    }
}