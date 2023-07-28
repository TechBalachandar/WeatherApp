package com.balu.whatsweather.data.location;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\t\u001a\u0004\u0018\u00010\nH\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/balu/whatsweather/data/location/LocationTrackerImpl;", "Lcom/balu/whatsweather/data/location/LocationTracker;", "locationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "application", "Landroid/app/Application;", "(Lcom/google/android/gms/location/FusedLocationProviderClient;Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "getCurrentLocation", "Landroid/location/Location;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LocationTrackerImpl implements com.balu.whatsweather.data.location.LocationTracker {
    private final com.google.android.gms.location.FusedLocationProviderClient locationClient = null;
    @org.jetbrains.annotations.NotNull
    private final android.app.Application application = null;
    
    @javax.inject.Inject
    public LocationTrackerImpl(@org.jetbrains.annotations.NotNull
    com.google.android.gms.location.FusedLocationProviderClient locationClient, @org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.app.Application getApplication() {
        return null;
    }
    
    /**
     * Returns the current location of the user
     */
    @org.jetbrains.annotations.Nullable
    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @java.lang.Override
    public java.lang.Object getCurrentLocation(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super android.location.Location> continuation) {
        return null;
    }
}