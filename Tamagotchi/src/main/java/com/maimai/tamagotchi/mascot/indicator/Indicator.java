package com.maimai.tamagotchi.mascot.indicator;

import com.maimai.tamagotchi.api.statistic.SimpleStatistic;
import com.maimai.tamagotchi.utils.listeners.IndicatorListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Indicator extends SimpleStatistic {

    private IndicatorLevel level;

    private final List<IndicatorListener> listeners = new ArrayList<>();

    public Indicator() {
    }

    public Indicator(int value) {
        super(value);
        assignLevel();
    }

    public Indicator(Map<String, Object> objectMap) {
        this(((Number) objectMap.getOrDefault("value", 0)).intValue());
    }

    public IndicatorLevel getLevel() {
        return level;
    }

    @Override
    public void set(int toSet) {
        super.set(toSet);
        assignLevel();

        listeners.forEach(indicatorListener -> indicatorListener.onChange(this));
    }

    @Override
    public String toString() {
        return "Indicator{" +
                "level=" + level +
                ", value=" + value +
                '}';
    }

    private void assignLevel() {
        this.level = IndicatorLevel.getByNumericRepresentation(get());
    }

    public void addListener(IndicatorListener indicatorListener) {
        if (indicatorListener == null) {
            throw new NullPointerException();
        }

        listeners.add(indicatorListener);
    }

    public enum IndicatorLevel {
        HIGHEST,
        HIGH,
        NORMAL,
        LOW,
        LOWEST;

        public static IndicatorLevel getByNumericRepresentation(int value) {
            if (value <= 19) {
                return LOWEST;
            } else if (isBetween(20, value, 39)) {
                return LOW;
            } else if (isBetween(40, value, 59)) {
                return NORMAL;
            } else if (isBetween(60, value, 79)) {
                return HIGH;
            } else if (value >= 80) {
                return HIGHEST;
            }
            return null;
        }

        private static boolean isBetween(int a, int b, int c) {
            return b >= a && b <= c;
        }
    }
}