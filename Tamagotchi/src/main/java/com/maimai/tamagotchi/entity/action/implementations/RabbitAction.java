package com.maimai.tamagotchi.entity.action.implementations;

import com.maimai.tamagotchi.entity.action.ActionModel;

public class RabbitAction implements ActionModel {
    /* Default actions */
    @Override
    public void drinkAction() {
        System.out.println("this is just a test and is temporal");
    }

    @Override
    public void eatAction() {
        System.out.println("this is just a test and is temporal");
    }

    @Override
    public void jumpAction() {
        System.out.println("this is just a test and is temporal");
    }

    @Override
    public void runAction() {
        System.out.println("this is just a test and is temporal");
    }

    @Override
    public void sleepAction() {
        System.out.println("this is just a test and is temporal");
    }

    /* Special actions */
    public void biteAction() {
        System.out.println("this is just a test and is temporal");
    }

    public void kickAction() {
        System.out.println("this is just a test and is temporal");
    }
}
