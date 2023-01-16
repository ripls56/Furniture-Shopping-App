@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.furniture_shopping_app.ui.screens.catalog_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingBag
import androidx.compose.material.icons.outlined.Chair
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.furniture_shopping_app.R
import com.example.furniture_shopping_app.ui.components.CatalogChips
import com.example.furniture_shopping_app.ui.components.CatalogTopAppBar
import com.example.furniture_shopping_app.ui.screens.home_screen.BottomBarScreen
import com.example.furniture_shopping_app.ui.theme.FurnitureShoppingAppTheme

@Preview
@Composable
fun CatalogPrev() {
    CatalogScreen(navController = rememberNavController())
}

@Composable
fun CatalogScreen(navController: NavHostController) {
    Column{
        Chips()
        Grid()
    }
}

@Composable
private fun Chips() {
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

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    BottomNavigationItem(
        label = {
            Text(text = screen.title)
        },
        icon = {
            Icon(
                imageVector = screen.icon,
                contentDescription = ""
            )
        },
        selected = currentDestination?.hierarchy?.any{
            it.route == screen.route
        } == true,
        onClick = {
            navController.navigate(screen.route)
        }
    )
}

@Composable
private fun Grid() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2)
    ) {
        items(10){
            GridItem()
        }
    }
}

@Composable
private fun GridItem(
    photo: String = "",
    name: String = "",
    title: String = ""
) {
    FurnitureShoppingAppTheme {
        Column(
            modifier = Modifier
                .padding(20.dp),
        ) {
            Box {
                Surface(shape = ShapeDefaults.Small) {
                    Image(
                        bitmap = ImageBitmap.imageResource(id = R.drawable.lamp),
                        contentDescription = "",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .height(200.dp)
                            .width(157.dp)
                            .align(Alignment.Center),
                    )
                }
                Box(modifier = Modifier
                    .padding(10.dp)
                    .align(Alignment.BottomEnd)){
                    FilledIconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .size(40.dp),
                        shape = ShapeDefaults.ExtraSmall,
                        colors = IconButtonDefaults.iconButtonColors(
                            containerColor = MaterialTheme.colorScheme.secondary,
                            contentColor = MaterialTheme.colorScheme.primary
                        )
                    ) {
                        Icon(
                            imageVector = Icons.Filled.ShoppingBag,
                            contentDescription = "",
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Text(
                text = "Name"
            )
            Text(
                text = "$ 12.00"
            )
        }
    }
}