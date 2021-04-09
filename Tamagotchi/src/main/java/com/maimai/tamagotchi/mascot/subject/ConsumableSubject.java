package com.maimai.tamagotchi.mascot.subject;

import lombok.Getter;

@Getter
public enum ConsumableSubject {
    MONEY("Money"), FOOD("Food"), TOY("Toy");

    private final String name;

    ConsumableSubject(String name) {
        this.name = name;
    }
}
