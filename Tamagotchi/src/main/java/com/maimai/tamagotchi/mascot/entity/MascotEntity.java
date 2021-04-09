package com.maimai.tamagotchi.mascot.entity;

import com.maimai.tamagotchi.manager.IndicatorManager;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MascotEntity {

    private String name;

    private EntityType type;

    private IndicatorManager indicatorManager;
}