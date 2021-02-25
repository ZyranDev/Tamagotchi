package com.maimai.tamagotchi.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Getter@Setter
public class UserEntity {

    private final UUID uuid;
    private String displayName;
    private Map<String, MascotEntity> mascots;

    public UserEntity(String displayName) {
        this.displayName = displayName;
        this.uuid = UUID.randomUUID();
        this.mascots = new HashMap<>();
    }
}