package com.maimai.tamagotchi.manager;

import com.maimai.tamagotchi.consumable.base.Consumable;
import com.maimai.tamagotchi.consumable.IConsumable;
import com.maimai.tamagotchi.consumable.JsonConsumable;
import com.maimai.tamagotchi.utils.JsonFile;

import java.io.File;

public class ConsumableManager extends SimpleManager<String, Consumable> {
    private final File folder;

    public ConsumableManager(File folder) {
        if (!folder.exists())
            folder.mkdirs();

        this.folder = folder;
        loadConsumable();
    }

    private void loadConsumable() {
        File[] files = folder.listFiles((dir, name) -> name.startsWith("Consumables") && name.endsWith(".json"));
        if (files == null)
            return;

        for (File file : files) {
            IConsumable consumable = new JsonConsumable(new JsonFile(file));

            addManageableObject(consumable.getSessionName(), consumable.getConsumableEntity());
        }
    }
}
