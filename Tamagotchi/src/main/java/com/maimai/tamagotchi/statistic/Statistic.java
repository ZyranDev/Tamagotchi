package com.maimai.tamagotchi.statistic;

public interface Statistic {

    int get();

    void set(int toSet);

    default void addLevel(int toAdd) {
        set(get() + toAdd);
    }

    default void removeLevel(int toRemove) {
        set(get() - toRemove);
    }
}