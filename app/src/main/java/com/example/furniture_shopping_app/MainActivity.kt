package com.example.furniture_shopping_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.core.view.WindowCompat
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.furniture_shopping_app.navigation.SetupNavGraph
import com.example.furniture_shopping_app.ui.screens.home_screen.BottomNavGraph
import com.example.furniture_shopping_app.ui.theme.FurnitureShoppingAppTheme

@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, true)
        setContent {
            FurnitureShoppingAppTheme {
                navController = rememberNavController()
                SetupNavGraph(navController)
                BottomNavGraph(navController)
                TODO("НОВОЕ ОКНО В КОТРОМ ЛЕЖИТ СКАФФОЛД")
            }
        }
    }
}