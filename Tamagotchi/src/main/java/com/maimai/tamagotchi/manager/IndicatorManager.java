package com.maimai.tamagotchi.manager;

import com.maimai.tamagotchi.indicator.Indicator;
import com.maimai.tamagotchi.indicator.IndicatorType;

public class IndicatorManager extends SimpleManager<IndicatorType, Indicator> {

    public IndicatorManager() {
        super();

        addManageableObject(IndicatorType.FOOD, new Indicator(100));
        addManageableObject(IndicatorType.HEALTH, new Indicator(100));
        addManageableObject(IndicatorType.FUN, new Indicator(100));
        addManageableObject(IndicatorType.HYGIENE, new Indicator(100));
        addManageableObject(IndicatorType.SLEEP, new Indicator(100));
    }
}