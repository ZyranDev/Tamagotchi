package com.maimai.tamagotchi.mascot.subject;

import lombok.Getter;

@Getter
public enum ConsumableSubject {
    MONEY("Dinero"),
    FOOD("Comida"),
    TOY("Juguete");

    private final String name;

    ConsumableSubject(String name) {
        this.name = name;
    }
}
