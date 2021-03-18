package com.maimai.tamagotchi.consumable.base;

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
        loadConsumable();
    }

    private void loadConsumable() {
        File[] files = folder.listFiles((dir, name) -> name.startsWith("Consumables") && name.endsWith(".json"));
        if (Arrays.stream(Objects.requireNonNull(files)).noneMatch(File::isFile)) {
            new JsonFile(new File("saved games"), "Consumables");
            System.out.println("Saved games | Consumables has been created");
            return;
        }

        Arrays.stream(files).findAny().ifPresent(File::delete);
        new JsonFile(new File("saved games"), "Consumables");
        System.out.println("Saved games | Consumables has been loaded");
    }
}
