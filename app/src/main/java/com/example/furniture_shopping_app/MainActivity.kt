package com.example.furniture_shopping_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.furniture_shopping_app.navigation.SetupNavGraph
import com.example.furniture_shopping_app.ui.screens.catalog_screen.CatalogScreen
import com.example.furniture_shopping_app.ui.theme.Background
import com.example.furniture_shopping_app.ui.theme.FurnitureShoppingAppTheme

@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, true)
        setContent {
            FurnitureShoppingAppTheme {
                navController = rememberNavController()
                SetupNavGraph(navController)
            }
        }
    }
}