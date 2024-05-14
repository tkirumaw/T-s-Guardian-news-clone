package org.asghari.guardiannews.presentation.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0012\u0013\u0014B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0006R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/asghari/guardiannews/presentation/adapters/NewsListAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lorg/asghari/guardiannews/data/models/news/Result;", "Lorg/asghari/guardiannews/presentation/adapters/NewsListAdapter$NewsListViewHolder;", "()V", "itemClickListener", "Lorg/asghari/guardiannews/presentation/adapters/NewsListAdapter$ItemClickListener;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnClickListener", "onClickListener", "ItemClickListener", "NewsListViewHolder", "diffCallback", "app_debug"})
@javax.inject.Singleton
public final class NewsListAdapter extends androidx.paging.PagingDataAdapter<org.asghari.guardiannews.data.models.news.Result, org.asghari.guardiannews.presentation.adapters.NewsListAdapter.NewsListViewHolder> {
    private org.asghari.guardiannews.presentation.adapters.NewsListAdapter.ItemClickListener itemClickListener;
    
    @javax.inject.Inject
    public NewsListAdapter() {
        super(null, null, null);
    }
    
    public final void setOnClickListener(@org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.presentation.adapters.NewsListAdapter.ItemClickListener onClickListener) {
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.presentation.adapters.NewsListAdapter.NewsListViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.asghari.guardiannews.presentation.adapters.NewsListAdapter.NewsListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/asghari/guardiannews/presentation/adapters/NewsListAdapter$ItemClickListener;", "", "onClick", "", "newsId", "", "app_debug"})
    public static abstract interface ItemClickListener {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull
        java.lang.String newsId);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/asghari/guardiannews/presentation/adapters/NewsListAdapter$NewsListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lorg/asghari/guardiannews/databinding/NewsListItemBinding;", "(Lorg/asghari/guardiannews/presentation/adapters/NewsListAdapter;Lorg/asghari/guardiannews/databinding/NewsListItemBinding;)V", "getBinding", "()Lorg/asghari/guardiannews/databinding/NewsListItemBinding;", "app_debug"})
    public final class NewsListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final org.asghari.guardiannews.databinding.NewsListItemBinding binding = null;
        
        public NewsListViewHolder(@org.jetbrains.annotations.NotNull
        org.asghari.guardiannews.databinding.NewsListItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.asghari.guardiannews.databinding.NewsListItemBinding getBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lorg/asghari/guardiannews/presentation/adapters/NewsListAdapter$diffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lorg/asghari/guardiannews/data/models/news/Result;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class diffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<org.asghari.guardiannews.data.models.news.Result> {
        @org.jetbrains.annotations.NotNull
        public static final org.asghari.guardiannews.presentation.adapters.NewsListAdapter.diffCallback INSTANCE = null;
        
        private diffCallback() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        org.asghari.guardiannews.data.models.news.Result oldItem, @org.jetbrains.annotations.NotNull
        org.asghari.guardiannews.data.models.news.Result newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        org.asghari.guardiannews.data.models.news.Result oldItem, @org.jetbrains.annotations.NotNull
        org.asghari.guardiannews.data.models.news.Result newItem) {
            return false;
        }
    }
}