package com.maimai.tamagotchi.mascot.entity.state;

public enum EntityState {
    EXCELLENT("Excelente"),
    GOD("Bien"),
    BAD("Mal"),
    FEARLESS("Moribundo"),
    DIED("Muerto");

    private final String stateNamed;

    EntityState(String stateNamed) {
        this.stateNamed = stateNamed;
    }

    public String getStateNamed() {
        return stateNamed;
    }
}
