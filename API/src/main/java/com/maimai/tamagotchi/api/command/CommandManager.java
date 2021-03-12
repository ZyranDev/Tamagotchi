package com.maimai.tamagotchi.api.command;

import com.maimai.tamagotchi.api.command.context.CommandContext;
import com.maimai.tamagotchi.api.exception.CommandExecutionException;

public interface CommandManager {

    boolean executeCommand(CommandContext context) throws CommandExecutionException;

    void registerCommand(String commandName, Command command);

    void addPartProvider(CommandPartProvider provider);

    void registerListener(CommandListener commandListener);
}