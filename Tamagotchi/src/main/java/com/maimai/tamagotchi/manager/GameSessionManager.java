package com.maimai.tamagotchi.manager;

import com.maimai.tamagotchi.session.GameSession;
import com.maimai.tamagotchi.session.JsonGameSession;
import com.maimai.tamagotchi.util.JsonFile;

import java.io.File;

public class GameSessionManager extends SimpleManager<String, GameSession> {

    private final File folder;

    public GameSessionManager(File folder) {
        if (!folder.exists())
            folder.mkdirs();

        this.folder = folder;
        loadSessions();
    }

    private void loadSessions() {
        File[] files = folder.listFiles((dir, name) -> name.startsWith("GameSession") && name.endsWith(".json"));
        if (files == null)
            return;

        for (File file : files) {
            GameSession gameSession = new JsonGameSession(new JsonFile(file));
        }
    }
}