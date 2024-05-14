package org.asghari.guardiannews.presentation.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\n\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/asghari/guardiannews/presentation/viewmodels/NewsDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "newsDetailsUseCase", "Lorg/asghari/guardiannews/domain/usecases/NewsDetailsUseCase;", "(Lorg/asghari/guardiannews/domain/usecases/NewsDetailsUseCase;)V", "_newsDetails", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/asghari/guardiannews/other/NewsListState;", "newsDetails", "Landroidx/compose/runtime/MutableState;", "getNewsDetails", "()Landroidx/compose/runtime/MutableState;", "", "newsId", "", "newsFields", "app_debug"})
public final class NewsDetailsViewModel extends androidx.lifecycle.ViewModel {
    private final org.asghari.guardiannews.domain.usecases.NewsDetailsUseCase newsDetailsUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<org.asghari.guardiannews.other.NewsListState> _newsDetails = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<org.asghari.guardiannews.other.NewsListState> newsDetails = null;
    
    @javax.inject.Inject
    public NewsDetailsViewModel(@org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.domain.usecases.NewsDetailsUseCase newsDetailsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<org.asghari.guardiannews.other.NewsListState> getNewsDetails() {
        return null;
    }
    
    public final void getNewsDetails(@org.jetbrains.annotations.NotNull
    java.lang.String newsId, @org.jetbrains.annotations.NotNull
    java.lang.String newsFields) {
    }
}