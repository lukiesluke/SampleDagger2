package com.lwg.myapplicationdagger2;

import android.app.Application;

import com.lwg.myapplicationdagger2.di.ApplicationComponent;
import com.lwg.myapplicationdagger2.di.ApplicationModule;
import com.lwg.myapplicationdagger2.di.DaggerApplicationComponent;

public class SampleApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule()).build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
