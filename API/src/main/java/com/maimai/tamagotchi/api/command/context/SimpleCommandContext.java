package com.maimai.tamagotchi.api.command.context;

import java.util.Arrays;
import java.util.List;

public class SimpleCommandContext implements CommandContext {

    private final String commandName;

    private final String[] commandArgs;

    SimpleCommandContext(String commandName, String[] commandArgs) {
        this.commandName = commandName;
        this.commandArgs = commandArgs;
    }

    SimpleCommandContext(String[] commandArgs) {
        this(commandArgs[0], Arrays.copyOfRange(commandArgs, 1, commandArgs.length));
    }

    SimpleCommandContext(String commandName) {
        this(commandName, new String[0]);
    }

    @Override
    public String getCommandName() {
        return commandName;
    }

    @Override
    public List<String> getCommandArguments() {
        return Arrays.asList(commandArgs);
    }
}