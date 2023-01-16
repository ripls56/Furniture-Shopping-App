package com.example.furniture_shopping_app.ui.screens.home_screen

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen (
    val route: String,
    val title: String,
    val icon: ImageVector
){
    object Home: BottomBarScreen(
        route = "home_screen",
        title = "home",
        icon = Icons.Outlined.Home
    )
    object Favorite: BottomBarScreen(
        route = "home_screen",
        title = "home",
        icon = Icons.Outlined.Favorite
    )
    object Notification: BottomBarScreen(
        route = "home_screen",
        title = "home",
        icon = Icons.Outlined.Notifications
    )
    object Profile: BottomBarScreen(
        route = "home_screen",
        title = "home",
        icon = Icons.Outlined.Person
    )
}