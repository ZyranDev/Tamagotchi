package com.maimai.tamagotchi.manager;

import com.maimai.tamagotchi.mascot.subject.ConsumableSubject;
import com.maimai.tamagotchi.util.cache.implementation.ConsumableCache;
import com.maimai.tamagotchi.util.console.Console;

public class MoneyManager {

    private final ConsumableCache consumableCache = new ConsumableCache();

    public int getMoneyCache() {
        if (!consumableCache.exists(ConsumableSubject.MONEY)) return 0;

        return consumableCache.getValue(ConsumableSubject.MONEY);
    }

    public void setMoneyCache(int value) {
        consumableCache.addValue(ConsumableSubject.MONEY, value);

        consumableCache.find(ConsumableSubject.MONEY).ifPresent(integer -> {
            Console.print("", "&c&l¡ALERTA! &1» &r&dTú dinero ahora es &b" + getMoneyCache() + "&d!&r", "");
        });
    }

    public void addMoneyCache(int value) {
        if (!consumableCache.exists(ConsumableSubject.MONEY)) setMoneyCache(10);

        consumableCache.find(ConsumableSubject.MONEY).ifPresent(integer -> {
            replaceMoneyCache(getMoneyCache() + value);
        });
    }

    public void removeMoneyCache(int value) {
        consumableCache.find(ConsumableSubject.MONEY).ifPresent(integer -> {
            replaceMoneyCache(getMoneyCache() - value);
        });
    }

    public void replaceMoneyCache(int value) {
        consumableCache.find(ConsumableSubject.MONEY).ifPresent(integer -> {
            consumableCache.replaceValue(ConsumableSubject.MONEY, value);

            Console.print("",
                    "&c&l¡ALERTA! &1» &r&dTú dinero ha cambiado ahora es &b" + getMoneyCache() + "&d!",
                    "",
                    "&b» &dAntes &f→&r &1&l" + integer + "&r",
                    "&b» &dAhora &f→&r &1&l" + getMoneyCache() + "&r",
                    "");

            if (!(value < integer)) {
                Console.print("&b» &f&oSe han añadido: &a&l"
                        + (value - integer) + "$ &r&f&oa tu cuenta!&r", "");
                return;
            }

            Console.print("&b» &f&oSe han removido: &c&l"
                    + (integer -= getMoneyCache()) + "$ &r&f&ode tu cuenta!&r", "");
        });
    }

    public void deleteMoneyCache() {
        consumableCache.find(ConsumableSubject.MONEY).ifPresent(integer -> {
            consumableCache.removeValue(ConsumableSubject.MONEY);
            Console.print("",
                    "&c&l¡ALERTA! &1» &r&dTú dinero ha sido eliminado ahora es &b" + getMoneyCache() + "&d!",
                    "",
                    "&b» &dAntes &f→&r &1&l" + integer + "&r",
                    "&b» &dAhora &f→&r &1&l" + getMoneyCache() + "&r",
                    "");
        });
    }
}
