package com.example.furniture_shopping_app.ui.screens.home_screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.furniture_shopping_app.ui.screens.catalog_screen.CatalogScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ){
        composable(route = BottomBarScreen.Home.route){
            CatalogScreen(navController = navController)
        }
        composable(route = BottomBarScreen.Favorite.route){
            Box(modifier = Modifier.fillMaxSize()){
                Text(text = "Favorite")
            }
        }
        composable(route = BottomBarScreen.Notification.route){
            Box(modifier = Modifier.fillMaxSize()){
                Text(text = "Notification")
            }
        }
        composable(route = BottomBarScreen.Profile.route){
            Box(modifier = Modifier.fillMaxSize()){
                Text(text = "Profile")
            }
        }
    }
}