package com.maimai.tamagotchi.api.manager;

import java.util.Map;
import java.util.Optional;

public interface Manager<K, V> {

    void addManageableObject(K key, V value);

    V getManageableObject(K key);

    Map<K, V> getMap();

    default Optional<V> getOptionalType(K key) {
        return Optional.ofNullable(getManageableObject(key));
    }
}