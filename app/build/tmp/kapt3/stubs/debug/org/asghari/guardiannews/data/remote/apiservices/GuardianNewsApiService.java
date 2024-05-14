package org.asghari.guardiannews.data.remote.apiservices;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ;\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ/\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ;\u0010\u000f\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJG\u0010\u000f\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lorg/asghari/guardiannews/data/remote/apiservices/GuardianNewsApiService;", "", "getLastNewsList", "Lorg/asghari/guardiannews/data/models/news/NewsList;", "Page", "", "ShowFields", "", "ApiKey", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Sections", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewsById", "NewsIds", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewsListBYQuery", "Query", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface GuardianNewsApiService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/search")
    public abstract java.lang.Object getNewsById(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "ids")
    java.lang.String NewsIds, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "show-fields")
    java.lang.String ShowFields, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "api-key")
    java.lang.String ApiKey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.asghari.guardiannews.data.models.news.NewsList> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/search")
    public abstract java.lang.Object getNewsListBYQuery(@retrofit2.http.Query(value = "page")
    int Page, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "q")
    java.lang.String Query, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "section")
    java.lang.String Sections, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "show-fields")
    java.lang.String ShowFields, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "api-key")
    java.lang.String ApiKey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.asghari.guardiannews.data.models.news.NewsList> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/search")
    public abstract java.lang.Object getLastNewsList(@retrofit2.http.Query(value = "page")
    int Page, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "section")
    java.lang.String Sections, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "show-fields")
    java.lang.String ShowFields, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "api-key")
    java.lang.String ApiKey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.asghari.guardiannews.data.models.news.NewsList> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/search")
    public abstract java.lang.Object getNewsListBYQuery(@retrofit2.http.Query(value = "page")
    int Page, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "q")
    java.lang.String Query, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "show-fields")
    java.lang.String ShowFields, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "api-key")
    java.lang.String ApiKey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.asghari.guardiannews.data.models.news.NewsList> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/search")
    public abstract java.lang.Object getLastNewsList(@retrofit2.http.Query(value = "page")
    int Page, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "show-fields")
    java.lang.String ShowFields, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "api-key")
    java.lang.String ApiKey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.asghari.guardiannews.data.models.news.NewsList> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
}