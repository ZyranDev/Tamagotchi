package com.maimai.tamagotchi.managers;

import com.maimai.tamagotchi.entities.MascotEntity;
import com.maimai.tamagotchi.utils.Cache;

import java.util.Optional;
import java.util.UUID;

public class MascotManager extends Cache<UUID, MascotEntity> {

    public MascotEntity getMascotById(UUID uuid) {
        return getCache().get(uuid);
    }

    public Optional<MascotEntity> getMascotByOwnerId(UUID uuid) {
        return getCache().values().stream().filter(mascotEntity -> mascotEntity.getOwnerID().equals(uuid)).findFirst();
    }

    public void addMascot(MascotEntity mascotEntity) {
        getCache().put(mascotEntity.getUuid(), mascotEntity);
    }
}