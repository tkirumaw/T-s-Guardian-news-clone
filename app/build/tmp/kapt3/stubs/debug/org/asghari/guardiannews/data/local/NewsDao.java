package org.asghari.guardiannews.data.local;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ5\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lorg/asghari/guardiannews/data/local/NewsDao;", "", "()V", "DeleteNewsItem", "", "newsItem", "Lorg/asghari/guardiannews/data/local/model/NewsItem;", "(Lorg/asghari/guardiannews/data/local/model/NewsItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DeleteNewsItemByQuery", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetNewsItemsByQuery", "", "page", "", "itemCount", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "InsertAll", "newsItems", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "InsertNewsItem", "app_debug"})
public abstract class NewsDao {
    
    public NewsDao() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object InsertNewsItem(@org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.data.local.model.NewsItem newsItem, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object InsertAll(@org.jetbrains.annotations.NotNull
    java.util.List<org.asghari.guardiannews.data.local.model.NewsItem> newsItems, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object DeleteNewsItem(@org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.data.local.model.NewsItem newsItem, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM NewsItems WHERE bodyText LIKE \'%\'||(:query)||\'%\' OR webTitle LIKE \'%\'||(:query)||\'%\'  LIMIT :page , :itemCount")
    public abstract java.lang.Object GetNewsItemsByQuery(@org.jetbrains.annotations.Nullable
    java.lang.String query, int page, int itemCount, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<org.asghari.guardiannews.data.local.model.NewsItem>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM NewsItems WHERE bodyText LIKE \'%\'||(:query)||\'%\' OR webTitle LIKE \'%\'||(:query)||\'%\' ")
    public abstract java.lang.Object DeleteNewsItemByQuery(@org.jetbrains.annotations.Nullable
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}