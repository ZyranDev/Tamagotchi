package com.maimai.tamagotchi.api.command.context;

import java.util.List;

public interface CommandContext {

    String getCommandName();

    List<String> getCommandArguments();

    static CommandContext parse(String string) {
        String[] args = string.split(" ");

        if (args.length > 0)
            return new SimpleCommandContext(args);

        return new SimpleCommandContext(string);
    }

    static CommandContext newContext(String... args) {
        return new SimpleCommandContext(args);
    }

    static CommandContext newContext(String commandName, String... args) {
        return new SimpleCommandContext(commandName, args);
    }
}