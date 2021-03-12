package com.maimai.tamagotchi.api.command.manager;

import com.maimai.tamagotchi.api.command.*;
import com.maimai.tamagotchi.api.command.context.CommandContext;
import com.maimai.tamagotchi.api.exception.CommandExecutionException;

import java.util.*;

public class SimpleCommandManager implements CommandManager {

    private final Map<String, Command> commandMap;

    private final List<CommandListener> commandListeners;

    private final List<CommandPartProvider> commandPartProviders;

    public SimpleCommandManager() {
        this.commandMap = new HashMap<>();
        this.commandListeners = new ArrayList<>();
        this.commandPartProviders = new ArrayList<>();
    }

    @Override
    public boolean executeCommand(CommandContext context) throws CommandExecutionException {
        String name = context.getCommandName();

        Command command = commandMap.get(name);

        if (command == null)
            return false;

        for (String commandArgument : context.getCommandArguments()) {
            Command subCommand = command.getSubCommands().get(commandArgument);

            if (subCommand != null)
                command = subCommand;
        }

        CommandArgumentManager argumentManager = new CommandArgumentManagerImpl(context.getCommandArguments().toArray(new String[0]));

        commandPartProviders.forEach(commandInterceptor -> commandInterceptor.configure(argumentManager));

        try {
            CommandResponse commandResponse;
            if ((commandResponse = command.execute(argumentManager)) != null) {
                commandListeners.forEach(commandListener -> commandListener.listen(commandResponse));
            }
        } catch (Exception e) {
            throw new CommandExecutionException("Failed on execute command '" + name + "'", e);
        }
        return true;
    }

    @Override
    public void registerCommand(String commandName, Command command) {
        Objects.requireNonNull(command, "command cannot be null");

        commandMap.put(commandName, command);
    }

    @Override
    public void addPartProvider(CommandPartProvider provider) {
        commandPartProviders.add(Objects.requireNonNull(provider, "interceptor cannot be null"));
    }

    @Override
    public void registerListener(CommandListener commandListener) {
        commandListeners.add(Objects.requireNonNull(commandListener, "command listener cannot be null"));
    }
}