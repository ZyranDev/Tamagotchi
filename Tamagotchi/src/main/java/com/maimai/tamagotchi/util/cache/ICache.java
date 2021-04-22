package com.maimai.tamagotchi.util.cache;

import java.util.Map;
import java.util.Optional;

public interface ICache<K, V> {
    Map<K, V> get();

    default void replaceValue(K key, V value) {
        get().replace(key, value);
    }

    default void addValue(K key, V value) {
        get().put(key, value);
    }

    default void removeValue(K key) {
        get().remove(key);
    }

    default V getValue(K key) {
        return get().get(key);
    }

    default Optional<V> find(K key) {
        return Optional.ofNullable(get().get(key));
    }

    default boolean exists(K key) {
        return get().containsKey(key);
    }
}
