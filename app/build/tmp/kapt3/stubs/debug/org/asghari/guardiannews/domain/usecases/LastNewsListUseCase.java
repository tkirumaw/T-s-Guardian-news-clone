package org.asghari.guardiannews.domain.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J5\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lorg/asghari/guardiannews/domain/usecases/LastNewsListUseCase;", "", "guardianNewsRepository", "Lorg/asghari/guardiannews/domain/repositories/GuardianNewsRepository;", "errorHandler", "Lorg/asghari/guardiannews/domain/exceptions/IErrorHandler;", "(Lorg/asghari/guardiannews/domain/repositories/GuardianNewsRepository;Lorg/asghari/guardiannews/domain/exceptions/IErrorHandler;)V", "invoke", "", "page", "", "sections", "", "onResult", "Lorg/asghari/guardiannews/domain/base/UseCaseCallback;", "Lorg/asghari/guardiannews/data/models/news/NewsList;", "(Ljava/lang/Integer;Ljava/lang/String;Lorg/asghari/guardiannews/domain/base/UseCaseCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LastNewsListUseCase {
    private final org.asghari.guardiannews.domain.repositories.GuardianNewsRepository guardianNewsRepository = null;
    private final org.asghari.guardiannews.domain.exceptions.IErrorHandler errorHandler = null;
    
    @javax.inject.Inject
    public LastNewsListUseCase(@org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.domain.repositories.GuardianNewsRepository guardianNewsRepository, @org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.domain.exceptions.IErrorHandler errorHandler) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.Nullable
    java.lang.Integer page, @org.jetbrains.annotations.NotNull
    java.lang.String sections, @org.jetbrains.annotations.Nullable
    org.asghari.guardiannews.domain.base.UseCaseCallback<org.asghari.guardiannews.data.models.news.NewsList> onResult, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}