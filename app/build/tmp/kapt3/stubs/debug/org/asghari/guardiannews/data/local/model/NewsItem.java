package org.asghari.guardiannews.data.local.model;

import java.lang.System;

@androidx.room.Entity(tableName = "NewsItems")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0014J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\bH\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0003J\u0091\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00103\u001a\u00020\b2\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u000206H\u00d6\u0001J\t\u00107\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016\u00a8\u00068"}, d2 = {"Lorg/asghari/guardiannews/data/local/model/NewsItem;", "", "apiUrl", "", "fields", "Lorg/asghari/guardiannews/data/local/model/Fields;", "id", "isHosted", "", "pillarId", "pillarName", "sectionId", "sectionName", "tags", "", "Lorg/asghari/guardiannews/data/local/model/Tag;", "type", "webPublicationDate", "webTitle", "webUrl", "(Ljava/lang/String;Lorg/asghari/guardiannews/data/local/model/Fields;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiUrl", "()Ljava/lang/String;", "getFields", "()Lorg/asghari/guardiannews/data/local/model/Fields;", "getId", "()Z", "getPillarId", "getPillarName", "getSectionId", "getSectionName", "getTags", "()Ljava/util/List;", "getType", "getWebPublicationDate", "getWebTitle", "getWebUrl", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class NewsItem {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String apiUrl = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.Embedded
    private final org.asghari.guardiannews.data.local.model.Fields fields = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.PrimaryKey
    private final java.lang.String id = null;
    private final boolean isHosted = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String pillarId = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String pillarName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String sectionId = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String sectionName = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<org.asghari.guardiannews.data.local.model.Tag> tags = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String webPublicationDate = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String webTitle = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String webUrl = null;
    
    @org.jetbrains.annotations.NotNull
    public final org.asghari.guardiannews.data.local.model.NewsItem copy(@org.jetbrains.annotations.NotNull
    java.lang.String apiUrl, @org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.data.local.model.Fields fields, @org.jetbrains.annotations.NotNull
    java.lang.String id, boolean isHosted, @org.jetbrains.annotations.NotNull
    java.lang.String pillarId, @org.jetbrains.annotations.NotNull
    java.lang.String pillarName, @org.jetbrains.annotations.NotNull
    java.lang.String sectionId, @org.jetbrains.annotations.NotNull
    java.lang.String sectionName, @org.jetbrains.annotations.NotNull
    java.util.List<org.asghari.guardiannews.data.local.model.Tag> tags, @org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    java.lang.String webPublicationDate, @org.jetbrains.annotations.NotNull
    java.lang.String webTitle, @org.jetbrains.annotations.NotNull
    java.lang.String webUrl) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public NewsItem(@org.jetbrains.annotations.NotNull
    java.lang.String apiUrl, @org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.data.local.model.Fields fields, @org.jetbrains.annotations.NotNull
    java.lang.String id, boolean isHosted, @org.jetbrains.annotations.NotNull
    java.lang.String pillarId, @org.jetbrains.annotations.NotNull
    java.lang.String pillarName, @org.jetbrains.annotations.NotNull
    java.lang.String sectionId, @org.jetbrains.annotations.NotNull
    java.lang.String sectionName, @org.jetbrains.annotations.NotNull
    java.util.List<org.asghari.guardiannews.data.local.model.Tag> tags, @org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    java.lang.String webPublicationDate, @org.jetbrains.annotations.NotNull
    java.lang.String webTitle, @org.jetbrains.annotations.NotNull
    java.lang.String webUrl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getApiUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.asghari.guardiannews.data.local.model.Fields component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.asghari.guardiannews.data.local.model.Fields getFields() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean isHosted() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPillarId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPillarName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSectionId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSectionName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<org.asghari.guardiannews.data.local.model.Tag> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<org.asghari.guardiannews.data.local.model.Tag> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWebPublicationDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWebTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWebUrl() {
        return null;
    }
}