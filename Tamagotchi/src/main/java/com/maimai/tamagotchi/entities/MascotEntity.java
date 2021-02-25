package com.maimai.tamagotchi.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class MascotEntity {

    public enum MascotState {
        ALIVE, DEATH
    }

    private final UUID uuid;
    private final String name, type;
    private MascotState state;
    private UserEntity owner;
    private int age;
    private double health, hunger;

    public MascotEntity(String name, String type) {
        this.name = name;
        this.type = type;
        this.uuid = UUID.randomUUID();
        this.health = 100.0;
        this.hunger = 100.0;
    }

    public void displayInfo() {

    }
}