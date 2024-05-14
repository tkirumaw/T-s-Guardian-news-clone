package org.asghari.guardiannews.data.remote.apiservices;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\u00020\u00032\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lorg/asghari/guardiannews/data/remote/apiservices/SectionsApiService;", "", "getSections", "Lorg/asghari/guardiannews/data/models/sections/Sections;", "ApiKey", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSectionsById", "Query", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface SectionsApiService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/sections")
    public abstract java.lang.Object getSections(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "api-key")
    java.lang.String ApiKey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.asghari.guardiannews.data.models.sections.Sections> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/sections")
    public abstract java.lang.Object getSectionsById(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "q")
    java.lang.String Query, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "api-key")
    java.lang.String ApiKey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.asghari.guardiannews.data.models.sections.Sections> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
}