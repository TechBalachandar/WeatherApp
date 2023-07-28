package com.balu.whatsweather.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J+\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ-\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/balu/whatsweather/data/repository/WeatherRepositoryImpl;", "Lcom/balu/whatsweather/data/repository/WeatherRepository;", "apiInterface", "Lcom/balu/whatsweather/data/remote/ApiInterface;", "(Lcom/balu/whatsweather/data/remote/ApiInterface;)V", "getCoordinates", "Lkotlinx/coroutines/flow/Flow;", "Lcom/balu/whatsweather/utils/Resource;", "", "Lcom/balu/whatsweather/data/model/CoordinatesResponse;", "cityName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherData", "Lcom/balu/whatsweather/data/model/WeatherResponse;", "lat", "long", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class WeatherRepositoryImpl implements com.balu.whatsweather.data.repository.WeatherRepository {
    private final com.balu.whatsweather.data.remote.ApiInterface apiInterface = null;
    
    @javax.inject.Inject
    public WeatherRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.balu.whatsweather.data.remote.ApiInterface apiInterface) {
        super();
    }
    
    /**
     * Fetches Weather Data from API
     */
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getWeatherData(@org.jetbrains.annotations.NotNull
    java.lang.String lat, @org.jetbrains.annotations.NotNull
    java.lang.String p1_1663806, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.balu.whatsweather.utils.Resource<com.balu.whatsweather.data.model.WeatherResponse>>> continuation) {
        return null;
    }
    
    /**
     * Fetches Coordinates from API
     */
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getCoordinates(@org.jetbrains.annotations.NotNull
    java.lang.String cityName, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.balu.whatsweather.utils.Resource<java.util.List<com.balu.whatsweather.data.model.CoordinatesResponse>>>> continuation) {
        return null;
    }
}