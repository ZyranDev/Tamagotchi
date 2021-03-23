package com.maimai.tamagotchi.consumable.base;

import com.google.gson.Gson;
import com.maimai.tamagotchi.utils.JsonFile;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;

public class JsonConsumable {
    File folder;

    public JsonConsumable(File folder) {
        this.folder = folder;
    }

    public void onCreate() {
        if (!folder.exists())
            folder.mkdirs();
        saveConsumable();
    }

    private void saveConsumable() {
        File[] files = folder.listFiles((dir, name) -> name.startsWith("Consumables") && name.endsWith(".json"));
        if (Arrays.stream(Objects.requireNonNull(files)).noneMatch(File::isFile)) {
            JsonFile jsonFile = new JsonFile(new File("saved games"), "Consumables");
            Gson gson = new Gson();

            gson.toJson(1);
            String json = "{\"date_as_long\" : 1411455611975}";
            jsonFile.writeJson(json);
            System.out.println("Saved games | Consumables has been created");
            return;
        }

        Arrays.stream(files).findAny().ifPresent(file -> file.delete());
        new JsonFile(new File("saved games"), "Consumables");
        System.out.println("Saved games | Consumables has been loaded");
    }
}
