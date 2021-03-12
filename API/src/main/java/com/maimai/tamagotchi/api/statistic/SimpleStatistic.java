package com.maimai.tamagotchi.api.statistic;

public class SimpleStatistic implements Statistic {

    protected int value;

    public SimpleStatistic(int value) {
        this.value = value;
    }

    public SimpleStatistic() {
        this(0);
    }

    @Override
    public int get() {
        return value;
    }

    @Override
    public void set(int toSet) {
        this.value = toSet;
    }

}