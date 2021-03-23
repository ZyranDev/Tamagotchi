package com.maimai.tamagotchi.menu.implementation;

import com.google.gson.Gson;
import com.maimai.tamagotchi.mascot.entity.EntityType;
import com.maimai.tamagotchi.mascot.entity.TamagotchiEntity;
import com.maimai.tamagotchi.mascot.indicator.IndicatorType;
import com.maimai.tamagotchi.session.GameSession;
import com.maimai.tamagotchi.utils.JsonFile;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class StartMenuData implements GameSession {

    /**
     * In this class, absolutely all the data obtained from the main menu class @params {MainMenu} will be saved,
     * and the existing files here will be modified since they are not really being used, since it is only a test.
     */

    File folder;

    public StartMenuData(File folder) {
        this.folder = folder;
    }

    public void onLoad() {
        if (!folder.exists()) {
            folder.mkdirs();
        }

        loadGameSession();
    }


    @Override
    public void loadGameSession() {
        File[] files = folder.listFiles((dir, name) -> name.startsWith("Consumables") && name.endsWith(".json"));
        if (Arrays.stream(Objects.requireNonNull(files)).noneMatch(File::exists)) {
            JsonFile jsonFile = new JsonFile(new File("saved games"), "Game Session");

            List<TamagotchiEntity.TamagotchiUser.Mascot> tamagotchiEntities = new ArrayList<>();
            List<TamagotchiEntity.TamagotchiUser.Mascot.MascotInventory> mascotEntitiesInventory = new ArrayList<>();
            List<TamagotchiEntity.TamagotchiUser.Mascot.MascotIndicator> mascotIndicators = new ArrayList<>();

            // Inventory
            mascotEntitiesInventory.add(
                    new TamagotchiEntity.TamagotchiUser.Mascot.MascotInventory("weather", 10));
            mascotEntitiesInventory.add(
                    new TamagotchiEntity.TamagotchiUser.Mascot.MascotInventory("milk", 1));
            mascotEntitiesInventory.add(
                    new TamagotchiEntity.TamagotchiUser.Mascot.MascotInventory("bread", 5));
            // End of inventory

            // Indicator
            mascotIndicators.add(
                    new TamagotchiEntity.TamagotchiUser.Mascot.MascotIndicator(IndicatorType.FOOD, 100));
            mascotIndicators.add(
                    new TamagotchiEntity.TamagotchiUser.Mascot.MascotIndicator(IndicatorType.FUN, 100));
            mascotIndicators.add(
                    new TamagotchiEntity.TamagotchiUser.Mascot.MascotIndicator(IndicatorType.HEALTH, 100));
            mascotIndicators.add(
                    new TamagotchiEntity.TamagotchiUser.Mascot.MascotIndicator(IndicatorType.HYGIENE, 100));
            mascotIndicators.add(
                    new TamagotchiEntity.TamagotchiUser.Mascot.MascotIndicator(IndicatorType.SLEEP, 100));
            // End of indicator

            tamagotchiEntities.add(
                    new TamagotchiEntity.TamagotchiUser.Mascot(
                            "Tiara",
                            EntityType.DOG,
                            mascotEntitiesInventory,
                            mascotIndicators));

            TamagotchiEntity tamagotchiEntity = new TamagotchiEntity(tamagotchiEntities);

            String json = new Gson().toJson(tamagotchiEntity);

            jsonFile.writeJson(json);
            System.out.println("Saved games | Consumables has been created");
            return;
        }

        System.out.println("Saved games | Consumables has been loaded");
    }

    @Override
    public void save() {

    }
}
