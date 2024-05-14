package org.asghari.guardiannews.presentation.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001a\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020\f2\b\b\u0002\u00100\u001a\u00020\fJ\u001e\u00101\u001a\u00020.2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020\fJ/\u00106\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020\f2\b\b\u0002\u00107\u001a\u0002032\b\b\u0002\u00100\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108J/\u00109\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020\f2\b\b\u0002\u00107\u001a\u0002032\b\b\u0002\u00100\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108J\u001a\u0010$\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020\f2\b\b\u0002\u00100\u001a\u00020\fR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100#\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e0#\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010%R\u001d\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e0#\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u001c\u0010*\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006:"}, d2 = {"Lorg/asghari/guardiannews/presentation/viewmodels/NewsListViewModel;", "Landroidx/lifecycle/ViewModel;", "lastNewsListUseCase", "Lorg/asghari/guardiannews/domain/usecases/LastNewsListUseCase;", "searchInNewsListUseCase", "Lorg/asghari/guardiannews/domain/usecases/SearchInNewsListUseCase;", "getSelectedSectionsUseCase", "Lorg/asghari/guardiannews/domain/usecases/GetSelectedSectionsUseCase;", "(Lorg/asghari/guardiannews/domain/usecases/LastNewsListUseCase;Lorg/asghari/guardiannews/domain/usecases/SearchInNewsListUseCase;Lorg/asghari/guardiannews/domain/usecases/GetSelectedSectionsUseCase;)V", "_SectionsToShow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "_SelectedSectionsList", "", "_newsList", "Lorg/asghari/guardiannews/other/NewsListState;", "call", "Lorg/asghari/guardiannews/data/models/news/NewsList;", "getCall", "()Lorg/asghari/guardiannews/data/models/news/NewsList;", "setCall", "(Lorg/asghari/guardiannews/data/models/news/NewsList;)V", "currentSearchQuery", "getCurrentSearchQuery", "()Ljava/lang/String;", "setCurrentSearchQuery", "(Ljava/lang/String;)V", "current_page", "", "getCurrent_page", "()I", "setCurrent_page", "(I)V", "newsList", "Landroidx/compose/runtime/MutableState;", "getNewsList", "()Landroidx/compose/runtime/MutableState;", "sectionsToShow", "getSectionsToShow", "selectedSectionsList", "getSelectedSectionsList", "tmpNewsList", "getTmpNewsList", "setTmpNewsList", "LoadMore", "", "query", "sections", "addSectionToShow", "isChecked", "", "section", "searchText", "getList", "fromDataStore", "(Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLoadMoreList", "app_debug"})
public final class NewsListViewModel extends androidx.lifecycle.ViewModel {
    private final org.asghari.guardiannews.domain.usecases.LastNewsListUseCase lastNewsListUseCase = null;
    private final org.asghari.guardiannews.domain.usecases.SearchInNewsListUseCase searchInNewsListUseCase = null;
    private final org.asghari.guardiannews.domain.usecases.GetSelectedSectionsUseCase getSelectedSectionsUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<org.asghari.guardiannews.other.NewsListState> _newsList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<org.asghari.guardiannews.other.NewsListState> newsList = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.String>> _SelectedSectionsList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<java.lang.String>> selectedSectionsList = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.String>> _SectionsToShow = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<java.lang.String>> sectionsToShow = null;
    public org.asghari.guardiannews.data.models.news.NewsList call;
    @org.jetbrains.annotations.Nullable
    private org.asghari.guardiannews.data.models.news.NewsList tmpNewsList;
    @org.jetbrains.annotations.NotNull
    private java.lang.String currentSearchQuery = "";
    private int current_page = 1;
    
    @javax.inject.Inject
    public NewsListViewModel(@org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.domain.usecases.LastNewsListUseCase lastNewsListUseCase, @org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.domain.usecases.SearchInNewsListUseCase searchInNewsListUseCase, @org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.domain.usecases.GetSelectedSectionsUseCase getSelectedSectionsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<org.asghari.guardiannews.other.NewsListState> getNewsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<java.lang.String>> getSelectedSectionsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<java.lang.String>> getSectionsToShow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.asghari.guardiannews.data.models.news.NewsList getCall() {
        return null;
    }
    
    public final void setCall(@org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.data.models.news.NewsList p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.asghari.guardiannews.data.models.news.NewsList getTmpNewsList() {
        return null;
    }
    
    public final void setTmpNewsList(@org.jetbrains.annotations.Nullable
    org.asghari.guardiannews.data.models.news.NewsList p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCurrentSearchQuery() {
        return null;
    }
    
    public final void setCurrentSearchQuery(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getCurrent_page() {
        return 0;
    }
    
    public final void setCurrent_page(int p0) {
    }
    
    public final void addSectionToShow(boolean isChecked, @org.jetbrains.annotations.NotNull
    java.lang.String section, @org.jetbrains.annotations.NotNull
    java.lang.String searchText) {
    }
    
    public final void getNewsList(@org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    java.lang.String sections) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getList(@org.jetbrains.annotations.NotNull
    java.lang.String query, boolean fromDataStore, @org.jetbrains.annotations.NotNull
    java.lang.String sections, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void LoadMore(@org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    java.lang.String sections) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getLoadMoreList(@org.jetbrains.annotations.NotNull
    java.lang.String query, boolean fromDataStore, @org.jetbrains.annotations.NotNull
    java.lang.String sections, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}