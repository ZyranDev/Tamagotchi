package com.maimai.tamagotchi.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter@Setter
public class UserEntity {

    private final UUID uuid;
    private String displayName;
    private Set<UUID> mascots;

    public UserEntity(String displayName) {
        this.displayName = displayName;
        this.uuid = UUID.randomUUID();
        this.mascots = new HashSet<>();
    }

}