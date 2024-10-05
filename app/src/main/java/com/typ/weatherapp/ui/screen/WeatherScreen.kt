package com.typ.weatherapp.ui.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.typ.weatherapp.ui.theme.ColorBackground
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.dp
import com.typ.weatherapp.ui.screen.components.ActionBar
import com.typ.weatherapp.ui.screen.components.DailyForecast

@Composable
fun WeatherScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = ColorBackground
    ) { paddings ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddings)
                .padding(
                    horizontal = 24.dp,
                    vertical = 10.dp
                )
        ){
            ActionBar()
            Spacer(
                modifier = Modifier.height(12.dp)
            )
            DailyForecast()
        }
    }

}