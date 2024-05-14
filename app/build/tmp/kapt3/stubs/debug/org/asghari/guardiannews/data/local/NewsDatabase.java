package org.asghari.guardiannews.data.local;

import java.lang.System;

@androidx.room.TypeConverters(value = {org.asghari.guardiannews.data.local.Converters.class})
@androidx.room.Database(entities = {org.asghari.guardiannews.data.local.model.NewsItem.class}, version = 1)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lorg/asghari/guardiannews/data/local/NewsDatabase;", "Landroidx/room/RoomDatabase;", "()V", "newsDao", "Lorg/asghari/guardiannews/data/local/NewsDao;", "app_debug"})
public abstract class NewsDatabase extends androidx.room.RoomDatabase {
    
    public NewsDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract org.asghari.guardiannews.data.local.NewsDao newsDao();
}