package com.example.furniture_shopping_app.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration

@Composable
fun getPhoneHeight() : Int {
    val configuration = LocalConfiguration.current
    return configuration.screenHeightDp
}

@Composable
fun getPhoneWidth() : Int {
    val configuration = LocalConfiguration.current
    return configuration.screenWidthDp
}