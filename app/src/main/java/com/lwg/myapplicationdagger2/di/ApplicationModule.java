package com.lwg.myapplicationdagger2.di;

import com.lwg.myapplicationdagger2.models.Users;

import javax.inject.Singleton;

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

    @Provides
    @Singleton
    Users provideUser() {
        Users.Builder builder = new Users.Builder();
        builder.setName("Luke");
        builder.setEmail("lukiesluke@yahoo.com");
        builder.setAge(35);
        return builder.build();
    }

}
