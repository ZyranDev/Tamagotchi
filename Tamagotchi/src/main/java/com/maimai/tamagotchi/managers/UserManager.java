package com.maimai.tamagotchi.managers;

import com.maimai.tamagotchi.entities.UserEntity;
import com.maimai.tamagotchi.utils.Cache;

import java.util.Optional;
import java.util.UUID;

public class UserManager extends Cache<UUID, UserEntity> {

    public UserEntity createUser(String displayName) {
        UserEntity userEntity = new UserEntity(displayName);
        addUser(userEntity);
        return userEntity;
    }

    public Optional<UserEntity> getUserByDisplayName(String displayName) {
        return getCache().values().stream()
                .filter(userEntity -> userEntity.getDisplayName().equals(displayName)).findFirst();
    }

    public void addUser(UserEntity userEntity) {
        getCache().put(userEntity.getUuid(), userEntity);
    }
}