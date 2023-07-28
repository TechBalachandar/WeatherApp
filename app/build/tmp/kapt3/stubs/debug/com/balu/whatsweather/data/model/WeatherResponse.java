package com.balu.whatsweather.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\f\u00a2\u0006\u0002\u0010\u0019J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\fH\u00c6\u0003J\t\u00102\u001a\u00020\fH\u00c6\u0003J\t\u00103\u001a\u00020\bH\u00c6\u0003J\t\u00104\u001a\u00020\fH\u00c6\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\bH\u00c6\u0003J\t\u00107\u001a\u00020\nH\u00c6\u0003J\t\u00108\u001a\u00020\fH\u00c6\u0003J\t\u00109\u001a\u00020\u000eH\u00c6\u0003J\t\u0010:\u001a\u00020\u0010H\u00c6\u0003J\t\u0010;\u001a\u00020\u0012H\u00c6\u0003J\t\u0010<\u001a\u00020\u0014H\u00c6\u0003J\u0091\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\fH\u00c6\u0001J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010A\u001a\u00020\fH\u00d6\u0001J\t\u0010B\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0018\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0016\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0017\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0015\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/\u00a8\u0006C"}, d2 = {"Lcom/balu/whatsweather/data/model/WeatherResponse;", "", "coord", "Lcom/balu/whatsweather/data/model/coord;", "weather", "", "Lcom/balu/whatsweather/data/model/weather;", "base", "", "main", "Lcom/balu/whatsweather/data/model/main;", "visibility", "", "wind", "Lcom/balu/whatsweather/data/model/wind;", "clouds", "Lcom/balu/whatsweather/data/model/clouds;", "dt", "", "sys", "Lcom/balu/whatsweather/data/model/sys;", "timezone", "id", "name", "cod", "(Lcom/balu/whatsweather/data/model/coord;Ljava/util/List;Ljava/lang/String;Lcom/balu/whatsweather/data/model/main;ILcom/balu/whatsweather/data/model/wind;Lcom/balu/whatsweather/data/model/clouds;JLcom/balu/whatsweather/data/model/sys;IILjava/lang/String;I)V", "getBase", "()Ljava/lang/String;", "getClouds", "()Lcom/balu/whatsweather/data/model/clouds;", "getCod", "()I", "getCoord", "()Lcom/balu/whatsweather/data/model/coord;", "getDt", "()J", "getId", "getMain", "()Lcom/balu/whatsweather/data/model/main;", "getName", "getSys", "()Lcom/balu/whatsweather/data/model/sys;", "getTimezone", "getVisibility", "getWeather", "()Ljava/util/List;", "getWind", "()Lcom/balu/whatsweather/data/model/wind;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class WeatherResponse {
    @org.jetbrains.annotations.NotNull
    private final com.balu.whatsweather.data.model.coord coord = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.balu.whatsweather.data.model.weather> weather = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String base = null;
    @org.jetbrains.annotations.NotNull
    private final com.balu.whatsweather.data.model.main main = null;
    private final int visibility = 0;
    @org.jetbrains.annotations.NotNull
    private final com.balu.whatsweather.data.model.wind wind = null;
    @org.jetbrains.annotations.NotNull
    private final com.balu.whatsweather.data.model.clouds clouds = null;
    private final long dt = 0L;
    @org.jetbrains.annotations.NotNull
    private final com.balu.whatsweather.data.model.sys sys = null;
    private final int timezone = 0;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    private final int cod = 0;
    
    @org.jetbrains.annotations.NotNull
    public final com.balu.whatsweather.data.model.WeatherResponse copy(@org.jetbrains.annotations.NotNull
    com.balu.whatsweather.data.model.coord coord, @org.jetbrains.annotations.NotNull
    java.util.List<com.balu.whatsweather.data.model.weather> weather, @org.jetbrains.annotations.NotNull
    java.lang.String base, @org.jetbrains.annotations.NotNull
    com.balu.whatsweather.data.model.main main, int visibility, @org.jetbrains.annotations.NotNull
    com.balu.whatsweather.data.model.wind wind, @org.jetbrains.annotations.NotNull
    com.balu.whatsweather.data.model.clouds clouds, long dt, @org.jetbrains.annotations.NotNull
    com.balu.whatsweather.data.model.sys sys, int timezone, int id, @org.jetbrains.annotations.NotNull
    java.lang.String name, int cod) {
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
    
    public WeatherResponse(@org.jetbrains.annotations.NotNull
    com.balu.whatsweather.data.model.coord coord, @org.jetbrains.annotations.NotNull
    java.util.List<com.balu.whatsweather.data.model.weather> weather, @org.jetbrains.annotations.NotNull
    java.lang.String base, @org.jetbrains.annotations.NotNull
    com.balu.whatsweather.data.model.main main, int visibility, @org.jetbrains.annotations.NotNull
    com.balu.whatsweather.data.model.wind wind, @org.jetbrains.annotations.NotNull
    com.balu.whatsweather.data.model.clouds clouds, long dt, @org.jetbrains.annotations.NotNull
    com.balu.whatsweather.data.model.sys sys, int timezone, int id, @org.jetbrains.annotations.NotNull
    java.lang.String name, int cod) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.balu.whatsweather.data.model.coord component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.balu.whatsweather.data.model.coord getCoord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.balu.whatsweather.data.model.weather> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.balu.whatsweather.data.model.weather> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.balu.whatsweather.data.model.main component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.balu.whatsweather.data.model.main getMain() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getVisibility() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.balu.whatsweather.data.model.wind component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.balu.whatsweather.data.model.wind getWind() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.balu.whatsweather.data.model.clouds component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.balu.whatsweather.data.model.clouds getClouds() {
        return null;
    }
    
    public final long component8() {
        return 0L;
    }
    
    public final long getDt() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.balu.whatsweather.data.model.sys component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.balu.whatsweather.data.model.sys getSys() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getTimezone() {
        return 0;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int getCod() {
        return 0;
    }
}