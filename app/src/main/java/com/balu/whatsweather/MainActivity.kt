package com.balu.whatsweather

import android.Manifest
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.balu.whatsweather.presentation.viewmodel.WeatherViewModel
import com.balu.whatsweather.presentation.weather_home_screen.WeatherHomeScreen
import com.balu.whatsweather.ui.theme.DarkBlue
import com.balu.whatsweather.ui.theme.WhatsWeatherTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val viewModel: WeatherViewModel by viewModels()
    private lateinit var permissionLauncher: ActivityResultLauncher<Array<String>>

    // At the top level of your kotlin file:


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.getLocationFromPreferences()
        checkForCurrentLocationWeather()

        setContent {
            WhatsWeatherTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = DarkBlue
                ) {
                    WeatherHomeScreen()
                }
            }
        }
    }

    private fun checkForCurrentLocationWeather() {
        permissionLauncher = registerForActivityResult(
            ActivityResultContracts.RequestMultiplePermissions()
        ) {
            viewModel.loadLocationFromCoordinates()
        }
        permissionLauncher.launch(
            arrayOf(
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION,
            )
        )
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WhatsWeatherTheme() {

    }
}