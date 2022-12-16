package com.example.furniture_shopping_app.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.ViewCompat

private val DarkColorScheme = darkColorScheme(
//    primary = Purple80,
//    secondary = PurpleGrey80,
//    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    background = Background,
    primary = Black80, // цвет внутри кнопки
    onPrimary = Color.Black,
//    primaryContainer = Blue90,
//    onPrimaryContainer = Blue10,
//    inversePrimary = Blue80,
//    secondary = DarkBlue40,
//    onSecondary = Color.White,
//    secondaryContainer = DarkBlue90,
//    onSecondaryContainer = DarkBlue10,
//    tertiary = Yellow40,
//    onTertiary = Color.White,
//    tertiaryContainer = Yellow90,
//    onTertiaryContainer = Yellow10,
//    error = Red40,
//    onError = Color.White,
//    errorContainer = Red90,
//    onErrorContainer = Red10,
//    background = Grey99,
//    onBackground = Grey10,
//    surface = Color.Black,
//    onSurface = Color.Red,
//    inverseSurface = Grey20,
//    inverseOnSurface = Grey95,
//    surfaceVariant = BlueGrey90,
//    onSurfaceVariant = BlueGrey30,
//    outline = BlueGrey50
)

@Composable
fun FurnitureShoppingAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            (view.context as Activity).window.statusBarColor = colorScheme.primary.toArgb()
            ViewCompat.getWindowInsetsController(view)?.isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,
        content = content
    )
}