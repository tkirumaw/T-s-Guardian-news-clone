package org.asghari.guardiannews.data.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007J\u0018\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0006\u001a\u00020\bH\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0018\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\b0\b2\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u001a\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\fH\u0007J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0018\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\f0\f2\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0018\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u000e0\u000e2\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J \u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007H\u0007J\u0018\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0006\u001a\u00020\u000eH\u0007\u00a8\u0006\u0013"}, d2 = {"Lorg/asghari/guardiannews/data/local/Converters;", "", "()V", "ToJson", "", "kotlin.jvm.PlatformType", "value", "", "Lorg/asghari/guardiannews/data/local/model/Tag;", "ToList", "Totag", "fieldToJson", "Lorg/asghari/guardiannews/data/models/news/Fields;", "jsonToList", "Lorg/asghari/guardiannews/data/models/news/Tag;", "jsonTofield", "jsonTotag", "listToJson", "tagToJson", "app_debug"})
public final class Converters {
    
    public Converters() {
        super();
    }
    
    @androidx.room.TypeConverter
    public final java.lang.String listToJson(@org.jetbrains.annotations.Nullable
    java.util.List<org.asghari.guardiannews.data.models.news.Tag> value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.TypeConverter
    public final java.util.List<org.asghari.guardiannews.data.models.news.Tag> jsonToList(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
        return null;
    }
    
    @androidx.room.TypeConverter
    public final java.lang.String ToJson(@org.jetbrains.annotations.Nullable
    java.util.List<org.asghari.guardiannews.data.local.model.Tag> value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.TypeConverter
    public final java.util.List<org.asghari.guardiannews.data.local.model.Tag> ToList(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
        return null;
    }
    
    @androidx.room.TypeConverter
    public final java.lang.String fieldToJson(@org.jetbrains.annotations.Nullable
    org.asghari.guardiannews.data.models.news.Fields value) {
        return null;
    }
    
    @androidx.room.TypeConverter
    public final org.asghari.guardiannews.data.models.news.Fields jsonTofield(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
        return null;
    }
    
    @androidx.room.TypeConverter
    public final java.lang.String tagToJson(@org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.data.models.news.Tag value) {
        return null;
    }
    
    @androidx.room.TypeConverter
    public final org.asghari.guardiannews.data.models.news.Tag jsonTotag(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
        return null;
    }
    
    @androidx.room.TypeConverter
    public final java.lang.String ToJson(@org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.data.local.model.Tag value) {
        return null;
    }
    
    @androidx.room.TypeConverter
    public final org.asghari.guardiannews.data.local.model.Tag Totag(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
        return null;
    }
}