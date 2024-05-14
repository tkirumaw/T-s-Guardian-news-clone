package org.asghari.guardiannews.data.models.news;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003Ji\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020\u0003H\u00d6\u0001J\t\u0010,\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013\u00a8\u0006-"}, d2 = {"Lorg/asghari/guardiannews/data/models/news/Response;", "", "currentPage", "", "orderBy", "", "pageSize", "pages", "results", "", "Lorg/asghari/guardiannews/data/models/news/Result;", "startIndex", "status", "total", "userTier", "(ILjava/lang/String;IILjava/util/List;ILjava/lang/String;ILjava/lang/String;)V", "getCurrentPage", "()I", "getOrderBy", "()Ljava/lang/String;", "getPageSize", "getPages", "getResults", "()Ljava/util/List;", "setResults", "(Ljava/util/List;)V", "getStartIndex", "getStatus", "getTotal", "getUserTier", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Response {
    @com.google.gson.annotations.SerializedName(value = "currentPage")
    private final int currentPage = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "orderBy")
    private final java.lang.String orderBy = null;
    @com.google.gson.annotations.SerializedName(value = "pageSize")
    private final int pageSize = 0;
    @com.google.gson.annotations.SerializedName(value = "pages")
    private final int pages = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "results")
    private java.util.List<org.asghari.guardiannews.data.models.news.Result> results;
    @com.google.gson.annotations.SerializedName(value = "startIndex")
    private final int startIndex = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "status")
    private final java.lang.String status = null;
    @com.google.gson.annotations.SerializedName(value = "total")
    private final int total = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "userTier")
    private final java.lang.String userTier = null;
    
    @org.jetbrains.annotations.NotNull
    public final org.asghari.guardiannews.data.models.news.Response copy(int currentPage, @org.jetbrains.annotations.NotNull
    java.lang.String orderBy, int pageSize, int pages, @org.jetbrains.annotations.NotNull
    java.util.List<org.asghari.guardiannews.data.models.news.Result> results, int startIndex, @org.jetbrains.annotations.NotNull
    java.lang.String status, int total, @org.jetbrains.annotations.NotNull
    java.lang.String userTier) {
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
    
    public Response(int currentPage, @org.jetbrains.annotations.NotNull
    java.lang.String orderBy, int pageSize, int pages, @org.jetbrains.annotations.NotNull
    java.util.List<org.asghari.guardiannews.data.models.news.Result> results, int startIndex, @org.jetbrains.annotations.NotNull
    java.lang.String status, int total, @org.jetbrains.annotations.NotNull
    java.lang.String userTier) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getCurrentPage() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOrderBy() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getPageSize() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getPages() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<org.asghari.guardiannews.data.models.news.Result> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<org.asghari.guardiannews.data.models.news.Result> getResults() {
        return null;
    }
    
    public final void setResults(@org.jetbrains.annotations.NotNull
    java.util.List<org.asghari.guardiannews.data.models.news.Result> p0) {
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getStartIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getTotal() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserTier() {
        return null;
    }
}