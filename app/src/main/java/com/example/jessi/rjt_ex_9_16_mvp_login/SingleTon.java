package com.example.jessi.rjt_ex_9_16_mvp_login;

import android.app.Application;

public class SingleTon extends Application {

    private static SingleTon INSTANCE = null;

    public static SingleTon getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingleTon();
        }
        return(INSTANCE);
    }





}
