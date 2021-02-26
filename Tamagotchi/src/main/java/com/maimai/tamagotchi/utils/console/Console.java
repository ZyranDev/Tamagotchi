package com.maimai.tamagotchi.utils.console;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Console {

    private final Logger logger;

    public Console() {
        logger = LogManager.getLogger(Console.class);
    }

    public void sendMessage(String message) {
        logger.info(message);
    }
}