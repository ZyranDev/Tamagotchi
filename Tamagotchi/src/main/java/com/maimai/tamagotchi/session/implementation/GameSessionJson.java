package com.maimai.tamagotchi.session.implementation;

import com.google.gson.Gson;
import com.maimai.tamagotchi.mascot.entity.EntityType;
import com.maimai.tamagotchi.mascot.entity.TamagotchiEntity;
import com.maimai.tamagotchi.utils.JsonFile;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class GameSessionJson {
    File folder;

    public GameSessionJson(File folder) {
        this.folder = folder;
    }

    public void onCreate() {
        if (!folder.exists()) {
            folder.mkdirs();
        }

        loadGameSession();
    }

    private void loadGameSession() {
        File[] files = folder.listFiles((dir, name) -> name.startsWith("Consumables") && name.endsWith(".json"));
        if (Arrays.stream(Objects.requireNonNull(files)).anyMatch(File::exists)) {
            JsonFile jsonFile = new JsonFile(new File("saved games"), "Game Session");

            List<TamagotchiEntity.TamagotchiUser.Mascot> tamagotchiEntities = new ArrayList<>();
            List<TamagotchiEntity.TamagotchiUser.Mascot.MascotInventory> mascotchiEntitiesInventory = new ArrayList<>();

            mascotchiEntitiesInventory.add(
                    new TamagotchiEntity.TamagotchiUser.Mascot.MascotInventory("agua", 10));
            mascotchiEntitiesInventory.add(
                    new TamagotchiEntity.TamagotchiUser.Mascot.MascotInventory("leche", 1));
            mascotchiEntitiesInventory.add(
                    new TamagotchiEntity.TamagotchiUser.Mascot.MascotInventory("pan", 5));

            tamagotchiEntities.add(
                    new TamagotchiEntity.TamagotchiUser.Mascot("Tiara", EntityType.CAT, mascotchiEntitiesInventory));

            TamagotchiEntity tamagotchiEntity = new TamagotchiEntity(tamagotchiEntities);

            String json = new Gson().toJson(tamagotchiEntity);

            jsonFile.writeJson(json);
            System.out.println("Saved games | Consumables has been created");
            return;
        }

        System.out.println("Saved games | Consumables has been loaded");
    }
}
