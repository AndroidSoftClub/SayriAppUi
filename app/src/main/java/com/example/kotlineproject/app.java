package com.example.kotlineproject;

import android.app.Application;

import androidx.multidex.MultiDex;

public class app extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
    }
}
