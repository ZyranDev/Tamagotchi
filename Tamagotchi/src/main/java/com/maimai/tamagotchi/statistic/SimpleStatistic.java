package com.maimai.tamagotchi.statistic;

import java.util.Collections;
import java.util.Map;

public class SimpleStatistic implements Statistic {

    protected int value;

    public SimpleStatistic(int value) {
        this.value = value;
    }

    public SimpleStatistic(Map<String, Object> objectMap) {
        this((int) objectMap.get("value"));
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