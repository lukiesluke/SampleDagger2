package com.lwg.myapplicationdagger2.di;

import com.lwg.myapplicationdagger2.MainActivity;

import dagger.Component;

@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MainActivity mainActivity);
}
