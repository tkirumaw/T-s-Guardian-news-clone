package org.asghari.guardiannews.presentation.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006&"}, d2 = {"Lorg/asghari/guardiannews/presentation/fragments/HomePageFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/asghari/guardiannews/presentation/adapters/NewsListAdapter$ItemClickListener;", "()V", "_viewModel", "Lorg/asghari/guardiannews/presentation/viewmodels/NewsListViewModel;", "get_viewModel", "()Lorg/asghari/guardiannews/presentation/viewmodels/NewsListViewModel;", "_viewModel$delegate", "Lkotlin/Lazy;", "binding", "Lorg/asghari/guardiannews/databinding/HomePageFragmentBinding;", "newsListAdapter", "Lorg/asghari/guardiannews/presentation/adapters/NewsListAdapter;", "getNewsListAdapter", "()Lorg/asghari/guardiannews/presentation/adapters/NewsListAdapter;", "setNewsListAdapter", "(Lorg/asghari/guardiannews/presentation/adapters/NewsListAdapter;)V", "swipeContainer", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "getSwipeContainer", "()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "setSwipeContainer", "(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V", "onClick", "", "newsId", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class HomePageFragment extends androidx.fragment.app.Fragment implements org.asghari.guardiannews.presentation.adapters.NewsListAdapter.ItemClickListener {
    private final kotlin.Lazy _viewModel$delegate = null;
    @javax.inject.Inject
    public org.asghari.guardiannews.presentation.adapters.NewsListAdapter newsListAdapter;
    private org.asghari.guardiannews.databinding.HomePageFragmentBinding binding;
    public androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeContainer;
    
    public HomePageFragment() {
        super();
    }
    
    private final org.asghari.guardiannews.presentation.viewmodels.NewsListViewModel get_viewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.asghari.guardiannews.presentation.adapters.NewsListAdapter getNewsListAdapter() {
        return null;
    }
    
    public final void setNewsListAdapter(@org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.presentation.adapters.NewsListAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.swiperefreshlayout.widget.SwipeRefreshLayout getSwipeContainer() {
        return null;
    }
    
    public final void setSwipeContainer(@org.jetbrains.annotations.NotNull
    androidx.swiperefreshlayout.widget.SwipeRefreshLayout p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.NotNull
    java.lang.String newsId) {
    }
}