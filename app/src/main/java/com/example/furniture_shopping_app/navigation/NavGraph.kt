package com.example.furniture_shopping_app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.furniture_shopping_app.ui.screens.catalog_screen.CatalogScreen
import com.example.furniture_shopping_app.ui.screens.login_screen.LoginScreen
import com.example.furniture_shopping_app.ui.screens.registration_screen.RegistrationScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    ){
        composable(
            route = Screen.Login.route
        ){
            LoginScreen(navController = navController)
        }
        composable(
            route = Screen.Registration.route
        ){
            RegistrationScreen(navController = navController)
        }
        composable(
            route = Screen.Catalog.route
        ){
            CatalogScreen(navController = navController)
        }
    }
}