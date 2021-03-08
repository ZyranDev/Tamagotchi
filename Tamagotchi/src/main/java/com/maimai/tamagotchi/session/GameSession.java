package com.maimai.tamagotchi.session;

import com.maimai.tamagotchi.entity.MascotEntity;

public interface GameSession {

    void load();

    void save();

    MascotEntity getMascotEntity();

    String getSessionName();
}