package org.asghari.guardiannews.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ)\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ1\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0011\u0010\u0011\u001a\u00020\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lorg/asghari/guardiannews/data/remote/RemoteDataSource;", "", "getLastNewsList", "Lorg/asghari/guardiannews/data/models/news/NewsList;", "page", "", "showFields", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sections", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewsById", "newsIds", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewsListBYQuery", "query", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSections", "Lorg/asghari/guardiannews/data/models/sections/Sections;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSectionsById", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface RemoteDataSource {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getNewsById(@org.jetbrains.annotations.NotNull
    java.lang.String newsIds, @org.jetbrains.annotations.NotNull
    java.lang.String showFields, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.asghari.guardiannews.data.models.news.NewsList> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getNewsListBYQuery(int page, @org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    java.lang.String sections, @org.jetbrains.annotations.NotNull
    java.lang.String showFields, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.asghari.guardiannews.data.models.news.NewsList> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getLastNewsList(int page, @org.jetbrains.annotations.NotNull
    java.lang.String sections, @org.jetbrains.annotations.NotNull
    java.lang.String showFields, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.asghari.guardiannews.data.models.news.NewsList> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getNewsListBYQuery(int page, @org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    java.lang.String showFields, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.asghari.guardiannews.data.models.news.NewsList> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getLastNewsList(int page, @org.jetbrains.annotations.NotNull
    java.lang.String showFields, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.asghari.guardiannews.data.models.news.NewsList> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getSections(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.asghari.guardiannews.data.models.sections.Sections> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getSectionsById(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.asghari.guardiannews.data.models.sections.Sections> continuation);
}