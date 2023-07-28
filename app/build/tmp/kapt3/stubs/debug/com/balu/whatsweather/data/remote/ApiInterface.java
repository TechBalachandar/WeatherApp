package com.balu.whatsweather.data.remote;

import java.lang.System;

/**
 * Interface for Retrofit API Calls
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ-\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\'\u0010\t\u001a\u00020\n2\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/balu/whatsweather/data/remote/ApiInterface;", "", "getLatAndLong", "", "Lcom/balu/whatsweather/data/model/CoordinatesResponse;", "map", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeather", "Lcom/balu/whatsweather/data/model/WeatherResponse;", "Companion", "app_debug"})
public abstract interface ApiInterface {
    @org.jetbrains.annotations.NotNull
    public static final com.balu.whatsweather.data.remote.ApiInterface.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BASE_URL = "https://api.openweathermap.org";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String API_KEY = "e2fb27388c8995c0224343417393ec1f";
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/data/2.5/weather")
    public abstract java.lang.Object getWeather(@org.jetbrains.annotations.NotNull
    @retrofit2.http.QueryMap
    java.util.Map<java.lang.String, java.lang.String> map, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.balu.whatsweather.data.model.WeatherResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/geo/1.0/direct")
    public abstract java.lang.Object getLatAndLong(@org.jetbrains.annotations.NotNull
    @retrofit2.http.QueryMap
    java.util.Map<java.lang.String, java.lang.String> map, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.balu.whatsweather.data.model.CoordinatesResponse>> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/balu/whatsweather/data/remote/ApiInterface$Companion;", "", "()V", "API_KEY", "", "BASE_URL", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String BASE_URL = "https://api.openweathermap.org";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String API_KEY = "e2fb27388c8995c0224343417393ec1f";
        
        private Companion() {
            super();
        }
    }
}