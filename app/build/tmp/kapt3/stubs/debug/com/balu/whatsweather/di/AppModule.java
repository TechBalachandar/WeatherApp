package com.balu.whatsweather.di;

import java.lang.System;

/**
 * Dependency Provider for Application Components
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/balu/whatsweather/di/AppModule;", "", "()V", "LOCATION_FILE", "", "provideApiInterface", "Lcom/balu/whatsweather/data/remote/ApiInterface;", "provideFusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "app", "Landroid/app/Application;", "provideLocationRepository", "Lcom/balu/whatsweather/data/location/LocationTracker;", "locationRepositoryImpl", "Lcom/balu/whatsweather/data/location/LocationTrackerImpl;", "providePreferencesDataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "appContext", "Landroid/content/Context;", "provideWeatherRepository", "Lcom/balu/whatsweather/data/repository/WeatherRepository;", "weatherRepositoryImpl", "Lcom/balu/whatsweather/data/repository/WeatherRepositoryImpl;", "app_debug"})
@dagger.Module
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.balu.whatsweather.di.AppModule INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String LOCATION_FILE = "location.preferences_pb";
    
    private AppModule() {
        super();
    }
    
    /**
     * Provides Retrofit Instance
     */
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.balu.whatsweather.data.remote.ApiInterface provideApiInterface() {
        return null;
    }
    
    /**
     * Provides WeatherRepository Instance
     */
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.balu.whatsweather.data.repository.WeatherRepository provideWeatherRepository(@org.jetbrains.annotations.NotNull
    com.balu.whatsweather.data.repository.WeatherRepositoryImpl weatherRepositoryImpl) {
        return null;
    }
    
    /**
     * Provides FusedLocationProviderClient Instance
     */
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.google.android.gms.location.FusedLocationProviderClient provideFusedLocationProviderClient(@org.jetbrains.annotations.NotNull
    android.app.Application app) {
        return null;
    }
    
    /**
     * Provides LocationTracker Instance
     */
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.balu.whatsweather.data.location.LocationTracker provideLocationRepository(@org.jetbrains.annotations.NotNull
    com.balu.whatsweather.data.location.LocationTrackerImpl locationRepositoryImpl) {
        return null;
    }
    
    /**
     * Provides DataStore Single Instance
     */
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> providePreferencesDataStore(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context appContext) {
        return null;
    }
}