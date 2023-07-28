package com.balu.whatsweather.presentation.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000bH\u0002J\u0006\u0010\u001b\u001a\u00020\u0019J\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0006\u0010\u001d\u001a\u00020\u0019J\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 J\u0018\u0010!\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006#"}, d2 = {"Lcom/balu/whatsweather/presentation/viewmodel/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "weatherRepository", "Lcom/balu/whatsweather/data/repository/WeatherRepository;", "locationTracker", "Lcom/balu/whatsweather/data/location/LocationTracker;", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "(Lcom/balu/whatsweather/data/repository/WeatherRepository;Lcom/balu/whatsweather/data/location/LocationTracker;Landroidx/datastore/core/DataStore;)V", "lat", "", "long", "searchJob", "Lkotlinx/coroutines/Job;", "<set-?>", "Lcom/balu/whatsweather/presentation/weather_home_screen/WeatherHomeScreenState;", "weatherState", "getWeatherState", "()Lcom/balu/whatsweather/presentation/weather_home_screen/WeatherHomeScreenState;", "setWeatherState", "(Lcom/balu/whatsweather/presentation/weather_home_screen/WeatherHomeScreenState;)V", "weatherState$delegate", "Landroidx/compose/runtime/MutableState;", "getCoordinates", "", "cityName", "getLocationFromPreferences", "getWeatherData", "loadLocationFromCoordinates", "onEvent", "event", "Lcom/balu/whatsweather/presentation/weather_home_screen/WeatherHomeScreenEvents;", "storeCurrentLocation", "Companion", "app_debug"})
public final class WeatherViewModel extends androidx.lifecycle.ViewModel {
    private final com.balu.whatsweather.data.repository.WeatherRepository weatherRepository = null;
    private final com.balu.whatsweather.data.location.LocationTracker locationTracker = null;
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState weatherState$delegate = null;
    private java.lang.String lat = "";
    private kotlinx.coroutines.Job searchJob;
    @org.jetbrains.annotations.NotNull
    public static final com.balu.whatsweather.presentation.viewmodel.WeatherViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> LAST_LAT = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> LAST_LONG = null;
    
    @javax.inject.Inject
    public WeatherViewModel(@org.jetbrains.annotations.NotNull
    com.balu.whatsweather.data.repository.WeatherRepository weatherRepository, @org.jetbrains.annotations.NotNull
    com.balu.whatsweather.data.location.LocationTracker locationTracker, @org.jetbrains.annotations.NotNull
    androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.balu.whatsweather.presentation.weather_home_screen.WeatherHomeScreenState getWeatherState() {
        return null;
    }
    
    public final void setWeatherState(@org.jetbrains.annotations.NotNull
    com.balu.whatsweather.presentation.weather_home_screen.WeatherHomeScreenState p0) {
    }
    
    /**
     * This function is called when the user clicks on the search button
     */
    public final void getLocationFromPreferences() {
    }
    
    /**
     * This function is called when the user gives permission to access the location
     */
    public final void loadLocationFromCoordinates() {
    }
    
    /**
     * This function stores last location in the data store
     */
    private final void storeCurrentLocation(java.lang.String lat, java.lang.String p1_1663806) {
    }
    
    /**
     * This function is called after getting the coordinates to get the weather data
     */
    private final void getWeatherData(java.lang.String lat, java.lang.String p1_1663806) {
    }
    
    /**
     * This function is called after the user enters the city name to get the coordinates
     */
    private final void getCoordinates(java.lang.String cityName) {
    }
    
    /**
     * This function is called when the user clicks on the search button
     */
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.balu.whatsweather.presentation.weather_home_screen.WeatherHomeScreenEvents event) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lcom/balu/whatsweather/presentation/viewmodel/WeatherViewModel$Companion;", "", "()V", "LAST_LAT", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "getLAST_LAT", "()Landroidx/datastore/preferences/core/Preferences$Key;", "LAST_LONG", "getLAST_LONG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getLAST_LAT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getLAST_LONG() {
            return null;
        }
    }
}