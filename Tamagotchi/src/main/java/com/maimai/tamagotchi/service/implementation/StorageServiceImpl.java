package com.maimai.tamagotchi.service.implementation;

import com.maimai.tamagotchi.service.IService;
import com.maimai.tamagotchi.storage.mongo.MongoDB;
import me.yushust.inject.InjectAll;

@InjectAll
public class StorageServiceImpl implements IService {
    private MongoDB mongoDB;

    @Override
    public void start() {
        System.out.println(" > Initializing " + Thread.currentThread().getName());
        mongoDB.startMongoDB();
    }

    @Override
    public void interrupt() {
        System.out.println(" > Shutting down " + getClass().getName());
    }
}
