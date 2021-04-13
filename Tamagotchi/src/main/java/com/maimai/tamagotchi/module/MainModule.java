package com.maimai.tamagotchi.module;

import me.yushust.inject.AbstractModule;

public class MainModule extends AbstractModule {

    @Override
    protected void configure() {
        install(new ServiceModule());
        install(new StorageModule());
    }
}
