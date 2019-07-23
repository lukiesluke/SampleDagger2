package com.lwg.myapplicationdagger2.di;

import com.lwg.myapplicationdagger2.MainActivity;
import com.lwg.myapplicationdagger2.SecondActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MainActivity mainActivity);

    void inject(SecondActivity secondActivity);

}
