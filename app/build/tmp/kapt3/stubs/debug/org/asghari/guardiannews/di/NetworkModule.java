package org.asghari.guardiannews.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lorg/asghari/guardiannews/di/NetworkModule;", "", "()V", "ProvidesRetrofitNewsApi", "Lorg/asghari/guardiannews/data/remote/apiservices/GuardianNewsApiService;", "ProvidesRetrofitSectionApi", "Lorg/asghari/guardiannews/data/remote/apiservices/SectionsApiService;", "app_debug"})
@dagger.Module
public final class NetworkModule {
    
    public NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final org.asghari.guardiannews.data.remote.apiservices.GuardianNewsApiService ProvidesRetrofitNewsApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final org.asghari.guardiannews.data.remote.apiservices.SectionsApiService ProvidesRetrofitSectionApi() {
        return null;
    }
}