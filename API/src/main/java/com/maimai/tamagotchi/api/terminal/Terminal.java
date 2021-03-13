package com.maimai.tamagotchi.api.terminal;

import com.maimai.tamagotchi.api.command.CommandManager;
import com.maimai.tamagotchi.api.command.context.CommandContext;
import com.maimai.tamagotchi.api.message.MessageRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Terminal {

    private static boolean INITIALIZED;

    private final CommandManager commandManager;

    private final MessageRepository messageRepository;

    public Terminal(CommandManager commandManager, MessageRepository messageRepository) {
        if (INITIALIZED)
            throw new UnsupportedOperationException("cannot create more instances of Terminal");

        this.commandManager = commandManager;
        this.messageRepository = messageRepository;
    }

    public void init() throws IOException {
        if (INITIALIZED)
            throw new UnsupportedOperationException("cannot initialize a terminal two times");

        new Thread(() -> {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                String input;
                while ((input = bufferedReader.readLine()) != null) {
                    if (!input.equals(""))
                        if (!commandManager.executeCommand(CommandContext.parse(input))) {
                            System.out.println(messageRepository.getMessage("unknown-command"));
                        }
                }
                bufferedReader.close();
            } catch (IOException e) {
                throw new UnsupportedOperationException("Exception initializing Terminal", e);
            }
        }).start();
    }
}