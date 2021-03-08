package com.maimai.tamagotchi.entity;

import com.google.gson.annotations.SerializedName;
import com.maimai.tamagotchi.indicator.Indicator;
import com.maimai.tamagotchi.indicator.IndicatorType;
import com.maimai.tamagotchi.api.manager.Manager;
import com.maimai.tamagotchi.manager.IndicatorManager;

public class MascotEntity {

    private final String name;

    @SerializedName("indicators")
    private final IndicatorManager indicatorManager;

    private final EntityType type;

    public MascotEntity(String name, IndicatorManager indicatorManager, EntityType type) {
        this.name = name;
        this.indicatorManager = indicatorManager;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public EntityType getType() {
        return type;
    }

    public Manager<IndicatorType, Indicator> getIndicatorManager() {
        return indicatorManager;
    }
}