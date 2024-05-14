package org.asghari.guardiannews.data.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lorg/asghari/guardiannews/data/local/LocalDataSourceImpl;", "Lorg/asghari/guardiannews/data/local/LocalDataSource;", "appContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "SETTINGS", "", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "getDataStore", "()Landroidx/datastore/core/DataStore;", "settingsPreferencesDataStore", "getSettingsPreferencesDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "settingsPreferencesDataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "addSection", "", "ids", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSelectedSections", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeSection", "app_debug"})
public final class LocalDataSourceImpl implements org.asghari.guardiannews.data.local.LocalDataSource {
    private final java.lang.String SETTINGS = "Settings";
    private final kotlin.properties.ReadOnlyProperty settingsPreferencesDataStore$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore = null;
    
    public LocalDataSourceImpl(@org.jetbrains.annotations.NotNull
    android.content.Context appContext) {
        super();
    }
    
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> getSettingsPreferencesDataStore(android.content.Context $this$settingsPreferencesDataStore) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> getDataStore() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object addSection(@org.jetbrains.annotations.NotNull
    java.lang.String ids, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object removeSection(@org.jetbrains.annotations.NotNull
    java.lang.String ids, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getSelectedSections(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.String>> continuation) {
        return null;
    }
}