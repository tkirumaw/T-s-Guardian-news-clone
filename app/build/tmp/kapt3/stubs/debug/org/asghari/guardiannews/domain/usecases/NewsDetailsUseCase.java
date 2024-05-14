package org.asghari.guardiannews.domain.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lorg/asghari/guardiannews/domain/usecases/NewsDetailsUseCase;", "Lorg/asghari/guardiannews/domain/base/UseCase;", "Lorg/asghari/guardiannews/data/models/news/NewsList;", "", "guardianNewsRepository", "Lorg/asghari/guardiannews/domain/repositories/GuardianNewsRepository;", "errorHandler", "Lorg/asghari/guardiannews/domain/exceptions/IErrorHandler;", "(Lorg/asghari/guardiannews/domain/repositories/GuardianNewsRepository;Lorg/asghari/guardiannews/domain/exceptions/IErrorHandler;)V", "run", "newsId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class NewsDetailsUseCase extends org.asghari.guardiannews.domain.base.UseCase<org.asghari.guardiannews.data.models.news.NewsList, java.lang.String> {
    private final org.asghari.guardiannews.domain.repositories.GuardianNewsRepository guardianNewsRepository = null;
    
    @javax.inject.Inject
    public NewsDetailsUseCase(@org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.domain.repositories.GuardianNewsRepository guardianNewsRepository, @org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.domain.exceptions.IErrorHandler errorHandler) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object run(@org.jetbrains.annotations.Nullable
    java.lang.String newsId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.asghari.guardiannews.data.models.news.NewsList> continuation) {
        return null;
    }
}