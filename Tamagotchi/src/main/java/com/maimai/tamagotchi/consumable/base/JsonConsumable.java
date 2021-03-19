package com.maimai.tamagotchi.consumable.base;

import com.google.gson.Gson;
import com.maimai.tamagotchi.consumable.subject.ConsumableSubject;
import com.maimai.tamagotchi.manager.ConsumableManager;
import com.maimai.tamagotchi.utils.JsonFile;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
            ConsumableManager consumableManager = new ConsumableManager();
            System.out.println("Saved games | Consumables has been created");

            Arrays.stream(files).findAny().ifPresent(File::delete);

            List<ConsumableEntity> consumableEntities = new ArrayList<>();
            consumableEntities.add(new ConsumableEntity(ConsumableSubject.MONEY, 100));
            jsonFile.writeJson(new Gson().toJson(consumableEntities));

            return;
        }

        new JsonFile(new File("saved games"), "Consumables");
        System.out.println("Saved games | Consumables has been loaded");
    }
}
