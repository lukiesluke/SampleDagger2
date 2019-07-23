package com.lwg.myapplicationdagger2.di;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    public ApplicationModule() {
    }

    @Provides
    String provideEggs() {
        return "2 Eggs";
    }
}
