@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.furniture_shopping_app.ui.screens.catalog_screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Chair
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.furniture_shopping_app.ui.components.CatalogChips
import com.example.furniture_shopping_app.ui.components.CatalogTopAppBar

@Composable
fun CatalogScreen(navController: NavController) {
    Scaffold(
        topBar = {
            CatalogTopAppBar()
        }
    ) {
        Box(
            modifier = Modifier
                .padding(it)
        ){
            LazyRow(
                contentPadding = PaddingValues(15.dp)
            ) {
                items(10) {
                    CatalogChips(
                        onClick = {},
                        icon = Icons.Outlined.Chair,
                        title = "Chair",
                        contentDescription = "Chair",
                        isActive = false
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                }
            }
        }
    }
}