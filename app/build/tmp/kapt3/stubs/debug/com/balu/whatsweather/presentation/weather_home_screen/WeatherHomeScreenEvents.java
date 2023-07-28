package com.balu.whatsweather.presentation.weather_home_screen;

import java.lang.System;

/**
 * Sealed class for Weather Home Screen Events
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/balu/whatsweather/presentation/weather_home_screen/WeatherHomeScreenEvents;", "", "()V", "OnSearchQueryChange", "Lcom/balu/whatsweather/presentation/weather_home_screen/WeatherHomeScreenEvents$OnSearchQueryChange;", "app_debug"})
public abstract class WeatherHomeScreenEvents {
    
    private WeatherHomeScreenEvents() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/balu/whatsweather/presentation/weather_home_screen/WeatherHomeScreenEvents$OnSearchQueryChange;", "Lcom/balu/whatsweather/presentation/weather_home_screen/WeatherHomeScreenEvents;", "query", "", "(Ljava/lang/String;)V", "getQuery", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class OnSearchQueryChange extends com.balu.whatsweather.presentation.weather_home_screen.WeatherHomeScreenEvents {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String query = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.balu.whatsweather.presentation.weather_home_screen.WeatherHomeScreenEvents.OnSearchQueryChange copy(@org.jetbrains.annotations.NotNull
        java.lang.String query) {
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
        
        public OnSearchQueryChange(@org.jetbrains.annotations.NotNull
        java.lang.String query) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getQuery() {
            return null;
        }
    }
}