package com.maimai.tamagotchi.mascot.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MascotEntity {

    private String owner,
            name;

    private EntityType type;
}