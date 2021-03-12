package com.maimai.tamagotchi.api.command;

@FunctionalInterface
public interface CommandPartProvider {

    void configure(CommandArgumentManager provider);

}