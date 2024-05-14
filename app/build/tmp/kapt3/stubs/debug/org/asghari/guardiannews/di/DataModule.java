package org.asghari.guardiannews.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0007\u00a8\u0006\u0017"}, d2 = {"Lorg/asghari/guardiannews/di/DataModule;", "", "()V", "privideSectionsRepository", "Lorg/asghari/guardiannews/domain/repositories/SectionsRepository;", "remoteDataSource", "Lorg/asghari/guardiannews/data/remote/RemoteDataSource;", "provideErrorHandler", "Lorg/asghari/guardiannews/domain/exceptions/IErrorHandler;", "provideLocalDataSource", "Lorg/asghari/guardiannews/data/local/LocalDataSource;", "context", "Landroid/content/Context;", "provideNewsRepository", "Lorg/asghari/guardiannews/domain/repositories/GuardianNewsRepository;", "provideRemoteDataSource", "guardianNewsApiService", "Lorg/asghari/guardiannews/data/remote/apiservices/GuardianNewsApiService;", "sectionsApiService", "Lorg/asghari/guardiannews/data/remote/apiservices/SectionsApiService;", "provideSettingsRepository", "Lorg/asghari/guardiannews/domain/repositories/SettingsRepository;", "localDataSource", "app_debug"})
@dagger.Module
public final class DataModule {
    
    public DataModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final org.asghari.guardiannews.domain.repositories.GuardianNewsRepository provideNewsRepository(@org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.data.remote.RemoteDataSource remoteDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final org.asghari.guardiannews.domain.repositories.SectionsRepository privideSectionsRepository(@org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.data.remote.RemoteDataSource remoteDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final org.asghari.guardiannews.data.local.LocalDataSource provideLocalDataSource(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final org.asghari.guardiannews.domain.repositories.SettingsRepository provideSettingsRepository(@org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.data.local.LocalDataSource localDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final org.asghari.guardiannews.data.remote.RemoteDataSource provideRemoteDataSource(@org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.data.remote.apiservices.GuardianNewsApiService guardianNewsApiService, @org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.data.remote.apiservices.SectionsApiService sectionsApiService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final org.asghari.guardiannews.domain.exceptions.IErrorHandler provideErrorHandler() {
        return null;
    }
}