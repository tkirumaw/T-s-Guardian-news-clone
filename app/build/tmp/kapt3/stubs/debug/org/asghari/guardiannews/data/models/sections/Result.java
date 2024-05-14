package org.asghari.guardiannews.data.models.sections;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003JQ\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0006H\u00d6\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010\u00a8\u0006\""}, d2 = {"Lorg/asghari/guardiannews/data/models/sections/Result;", "", "activeSponsorships", "", "Lorg/asghari/guardiannews/data/models/sections/ActiveSponsorship;", "apiUrl", "", "editions", "Lorg/asghari/guardiannews/data/models/sections/Edition;", "id", "webTitle", "webUrl", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActiveSponsorships", "()Ljava/util/List;", "getApiUrl", "()Ljava/lang/String;", "getEditions", "getId", "getWebTitle", "getWebUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Result {
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "activeSponsorships")
    private final java.util.List<org.asghari.guardiannews.data.models.sections.ActiveSponsorship> activeSponsorships = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "apiUrl")
    private final java.lang.String apiUrl = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "editions")
    private final java.util.List<org.asghari.guardiannews.data.models.sections.Edition> editions = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "id")
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "webTitle")
    private final java.lang.String webTitle = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "webUrl")
    private final java.lang.String webUrl = null;
    
    @org.jetbrains.annotations.NotNull
    public final org.asghari.guardiannews.data.models.sections.Result copy(@org.jetbrains.annotations.NotNull
    java.util.List<org.asghari.guardiannews.data.models.sections.ActiveSponsorship> activeSponsorships, @org.jetbrains.annotations.NotNull
    java.lang.String apiUrl, @org.jetbrains.annotations.NotNull
    java.util.List<org.asghari.guardiannews.data.models.sections.Edition> editions, @org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
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
    
    public Result(@org.jetbrains.annotations.NotNull
    java.util.List<org.asghari.guardiannews.data.models.sections.ActiveSponsorship> activeSponsorships, @org.jetbrains.annotations.NotNull
    java.lang.String apiUrl, @org.jetbrains.annotations.NotNull
    java.util.List<org.asghari.guardiannews.data.models.sections.Edition> editions, @org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    java.lang.String webTitle, @org.jetbrains.annotations.NotNull
    java.lang.String webUrl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<org.asghari.guardiannews.data.models.sections.ActiveSponsorship> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<org.asghari.guardiannews.data.models.sections.ActiveSponsorship> getActiveSponsorships() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getApiUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<org.asghari.guardiannews.data.models.sections.Edition> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<org.asghari.guardiannews.data.models.sections.Edition> getEditions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWebTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWebUrl() {
        return null;
    }
}