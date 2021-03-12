package com.maimai.tamagotchi.api.command;

import java.util.Collections;
import java.util.Map;

@FunctionalInterface
public interface Command {

    CommandResponse execute(CommandArgumentManager manager);

    default Map<String, Command> getSubCommands() {
        return Collections.emptyMap();
    }
}