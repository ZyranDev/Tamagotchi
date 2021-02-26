package com.maimai.tamagotchi.utils.scheduler;

public interface SchedulerTask {

    int getTaskId();

    void cancel();
}