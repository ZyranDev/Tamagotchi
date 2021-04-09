package com.maimai.tamagotchi.service;

import com.maimai.tamagotchi.api.command.CommandManager;
import com.maimai.tamagotchi.api.command.manager.SimpleCommandManager;
import com.maimai.tamagotchi.api.message.MessageRepository;
import com.maimai.tamagotchi.api.service.Service;
import com.maimai.tamagotchi.api.terminal.Terminal;
import com.maimai.tamagotchi.command.UserModelPartProvider;

import java.io.IOException;

public class TerminalService implements Service {

    private final Terminal terminal;

    private final CommandManager commandManager;

    private final MessageRepository messageRepository;

    public TerminalService(TamagotchiService tamagotchiService) {
        this.commandManager = new SimpleCommandManager();
        this.commandManager.addPartProvider(new UserModelPartProvider(tamagotchiService));
        this.messageRepository = new MessageRepository();

        this.terminal = new Terminal(commandManager, messageRepository);
    }

    @Override
    public void start() {
        try {
            this.terminal.init();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void stop() {
        /* When the service is stopped, do return method */
        System.out.println("All has been stopped");
    }

    public CommandManager getCommandManager() {
        return commandManager;
    }

    public MessageRepository getMessageRepository() {
        return messageRepository;
    }
}