package com.maimai.tamagotchi.utils;

public interface Callback<Reply> {

    void done(Reply value);
}