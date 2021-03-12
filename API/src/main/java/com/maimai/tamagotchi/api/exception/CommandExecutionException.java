package com.maimai.tamagotchi.api.exception;

public class CommandExecutionException extends RuntimeException {

    public CommandExecutionException(String message, Throwable cause) {
        super(message, cause);
    }
}