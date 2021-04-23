package com.maimai.tamagotchi.api.message;

import com.maimai.tamagotchi.api.command.CommandListener;
import com.maimai.tamagotchi.api.command.CommandResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MessageRepository implements CommandListener {

    private final Map<String, String> messages;

    public MessageRepository() {
        this.messages = new HashMap<>();
        addMessage("unknown-command", "Unknown command, type \"help\" to see command list.");
    }

    public static CommandResponse commandResponse(String path) {
        return new MessageCommandResponse(path);
    }

    @Override
    public void listen(CommandResponse commandResponse) {
        if (commandResponse instanceof MessageCommandResponse) {
            System.out.println(messages.get(((MessageCommandResponse) commandResponse).path));
        }
    }

    public String getMessage(String path) {
        return messages.get(path);
    }

    public void addMessage(String path, String message) {
        this.messages.put(Objects.requireNonNull(path), Objects.requireNonNull(message));
    }

    private static class MessageCommandResponse implements CommandResponse {

        private final String path;

        public MessageCommandResponse(String path) {
            this.path = path;
        }
    }
}