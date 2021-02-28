package com.maimai.tamagotchi.utils.console;

public enum Colors {

    BLACK("\033[30m"),
    RED("\033[31m"),
    GREEN("\033[32m"),
    YELLOW("\033[33m"),
    BLUE("\033[34m"),
    PURPLE("\033[35m"),
    CYAN("\033[36m"),
    WHITE("\033[37m"),
    RESET("\u001B[0m");

    private String id;

    public String getId() {
        return id;
    }

    Colors(String id) {
        this.id = id;
    }

}
