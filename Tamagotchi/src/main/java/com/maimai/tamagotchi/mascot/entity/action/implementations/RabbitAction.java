package com.maimai.tamagotchi.mascot.entity.action.implementations;

import com.maimai.tamagotchi.mascot.entity.action.ActionModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RabbitAction implements ActionModel {
    /* Default actions */
    private final Random random = new Random();

    @Override
    public void drinkAction() {
        List<String> drinkActions = new ArrayList<>();

        drinkActions.add("Ummm yummy thanks, the drink was very tasty! `(*>﹏<*)´");
        drinkActions.add("Fantastic, now I can relax a little after taking this. ( •̀ ω •́ )✧");
        drinkActions.add("なんて嬉しいんだ！マスター、本当にありがとうございます。 ヾ(≧ ▽ ≦)ゝ");

        System.out.println(drinkActions.get(random.nextInt(drinkActions.size())));
    }

    @Override
    public void eatAction() {
        List<String> eatActions = new ArrayList<>();

        eatActions.add("Ummm yummy thanks, the drink was very tasty! `(*>﹏<*)´");
        eatActions.add("Fantastic, now I can relax a little after taking this. ( •̀ ω •́ )✧");
        eatActions.add("なんて嬉しいんだ！マスター、本当にありがとうございます。 ヾ(≧ ▽ ≦)ゝ");

        System.out.println(eatActions.get(random.nextInt(eatActions.size())));
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
