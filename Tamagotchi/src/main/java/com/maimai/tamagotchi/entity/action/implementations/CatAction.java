package com.maimai.tamagotchi.entity.action.implementations;

import com.maimai.tamagotchi.entity.action.ActionModel;

public class CatAction implements ActionModel {
    /* Default actions */
    @Override
    public void drinkAction() {
        System.out.println("Glup, glup, yummy! 🐱");
    }

    @Override
    public void eatAction() {
        System.out.println("Ñam, ñam, yummy! 🐱");
    }

    @Override
    public void jumpAction() {
        System.out.println("Wow it was an incredible jump! 🐱");
    }

    @Override
    public void runAction() {
        System.out.println("Fium, what speed! 🐱");
    }

    @Override
    public void sleepAction() {
        System.out.println("Z z z... 🐱");
    }

    /* Special actions */
    public void purrAction() {
        System.out.println("Nya, grr, meow 🐱");
    }

    public void somersaultAction() {
        System.out.println("Wow it was an incredible jump, it was close! 🐱");
    }
}
