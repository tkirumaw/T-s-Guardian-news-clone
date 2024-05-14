package org.asghari.guardiannews.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J)\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ!\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ1\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lorg/asghari/guardiannews/data/repository/GuardianNewsRepositoryImp;", "Lorg/asghari/guardiannews/domain/repositories/GuardianNewsRepository;", "remoteDataSource", "Lorg/asghari/guardiannews/data/remote/RemoteDataSource;", "(Lorg/asghari/guardiannews/data/remote/RemoteDataSource;)V", "getLastNewsList", "Lorg/asghari/guardiannews/data/models/news/NewsList;", "page", "", "sections", "", "showFields", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewsById", "newsIds", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewsListBYQuery", "query", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GuardianNewsRepositoryImp implements org.asghari.guardiannews.domain.repositories.GuardianNewsRepository {
    private final org.asghari.guardiannews.data.remote.RemoteDataSource remoteDataSource = null;
    
    @javax.inject.Inject
    public GuardianNewsRepositoryImp(@org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.data.remote.RemoteDataSource remoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getNewsById(@org.jetbrains.annotations.NotNull
    java.lang.String newsIds, @org.jetbrains.annotations.NotNull
    java.lang.String showFields, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.asghari.guardiannews.data.models.news.NewsList> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getNewsListBYQuery(@org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    java.lang.String sections, int page, @org.jetbrains.annotations.NotNull
    java.lang.String showFields, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.asghari.guardiannews.data.models.news.NewsList> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getLastNewsList(int page, @org.jetbrains.annotations.NotNull
    java.lang.String sections, @org.jetbrains.annotations.NotNull
    java.lang.String showFields, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.asghari.guardiannews.data.models.news.NewsList> continuation) {
        return null;
    }
}