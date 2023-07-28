package com.balu.whatsweather.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ-\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/balu/whatsweather/data/repository/WeatherRepository;", "", "getCoordinates", "Lkotlinx/coroutines/flow/Flow;", "Lcom/balu/whatsweather/utils/Resource;", "", "Lcom/balu/whatsweather/data/model/CoordinatesResponse;", "cityName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherData", "Lcom/balu/whatsweather/data/model/WeatherResponse;", "lat", "long", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface WeatherRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getWeatherData(@org.jetbrains.annotations.NotNull
    java.lang.String lat, @org.jetbrains.annotations.NotNull
    java.lang.String p1_1663806, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.balu.whatsweather.utils.Resource<com.balu.whatsweather.data.model.WeatherResponse>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCoordinates(@org.jetbrains.annotations.NotNull
    java.lang.String cityName, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.balu.whatsweather.utils.Resource<java.util.List<com.balu.whatsweather.data.model.CoordinatesResponse>>>> continuation);
}