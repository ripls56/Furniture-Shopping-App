package com.example.furniture_shopping_app.navigation

sealed class Screen(var route: String){
    object  Login: Screen(route = "login_screen")
    object  Registration: Screen(route = "registration_screen")
    object  Home: Screen(route = "home_screen")
}