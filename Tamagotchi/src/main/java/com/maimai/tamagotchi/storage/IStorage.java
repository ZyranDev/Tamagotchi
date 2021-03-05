package com.maimai.tamagotchi.storage;
import com.maimai.tamagotchi.entities.UserEntity;

import java.util.UUID;

public interface IStorage {

    UserEntity loadUser(UUID uuid);

    void saveUser(UserEntity userEntity);
}
