package org.asghari.guardiannews.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lorg/asghari/guardiannews/data/repository/SectionsRepositoryImp;", "Lorg/asghari/guardiannews/domain/repositories/SectionsRepository;", "remoteDataSource", "Lorg/asghari/guardiannews/data/remote/RemoteDataSource;", "(Lorg/asghari/guardiannews/data/remote/RemoteDataSource;)V", "getSections", "Lorg/asghari/guardiannews/data/models/sections/Sections;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSectionsById", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class SectionsRepositoryImp implements org.asghari.guardiannews.domain.repositories.SectionsRepository {
    private final org.asghari.guardiannews.data.remote.RemoteDataSource remoteDataSource = null;
    
    @javax.inject.Inject
    public SectionsRepositoryImp(@org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.data.remote.RemoteDataSource remoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getSections(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.asghari.guardiannews.data.models.sections.Sections> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getSectionsById(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.asghari.guardiannews.data.models.sections.Sections> continuation) {
        return null;
    }
}