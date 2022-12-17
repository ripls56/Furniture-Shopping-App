package com.example.furniture_shopping_app.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.PlatformParagraphStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.furniture_shopping_app.ui.theme.*

private val CHIP_ICON_PADDING = 8.dp
private val CHIP_TEXT_FONT_SIZE = 16.sp

@Composable
fun CatalogChips(
    onClick: () -> Unit,
    icon: ImageVector,
    contentDescription: String,
    title: String,
    isActive: Boolean
) {
    FurnitureShoppingAppTheme {
        Surface(
            shape = ShapeDefaults.Small,
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .wrapContentSize()
                    .clickable {
                        onClick()
                    }
                    .padding(8.dp)
            ) {
                Surface(
                    shape = ShapeDefaults.Small,
                ) {
                    if (isActive) {
                        SelectedChipIcon(icon = icon, contentDescription = contentDescription)
                    } else {
                        UnSelectedChipIcon(icon = icon, contentDescription = contentDescription)
                    }
                }
                if (isActive) {
                    SelectedChipText(title = title)
                } else {
                    UnSelectedChipText(title = title)
                }
            }
        }
    }
}


@Composable
private fun SelectedChipIcon(icon: ImageVector, contentDescription: String) {
    Icon(
        icon,
        contentDescription = contentDescription,
        modifier = Modifier
            .background(Black80)
            .padding(CHIP_ICON_PADDING),
        tint = Color.White
    )
}

@Composable
private fun UnSelectedChipIcon(icon: ImageVector, contentDescription: String) {
    Icon(
        icon,
        contentDescription = contentDescription,
        modifier = Modifier
            .background(OnPrimary)
            .padding(CHIP_ICON_PADDING),
        tint = Sub
    )
}

@Composable
private fun SelectedChipText(title: String) {
    Text(
        fontFamily = PoppinsFamily,
        fontSize = CHIP_TEXT_FONT_SIZE,
        color = Black80,
        text = buildAnnotatedString {
            withStyle(
                style = ParagraphStyle(
                    platformStyle = PlatformParagraphStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        alignment = LineHeightStyle.Alignment.Bottom,
                        trim = LineHeightStyle.Trim.LastLineBottom
                    )
                )
            ){
                append(title)
            }
        }
    )
}

@Composable
private fun UnSelectedChipText(title: String) {
    Text(
        fontFamily = PoppinsFamily,
        fontSize = CHIP_TEXT_FONT_SIZE,
        color = Sub,
        text = buildAnnotatedString {
            withStyle(
                style = ParagraphStyle(
                    platformStyle = PlatformParagraphStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        alignment = LineHeightStyle.Alignment.Bottom,
                        trim = LineHeightStyle.Trim.LastLineBottom
                    )
                )
            ){
                append(title)
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
private fun CatalogChipsPreview() {
    LazyRow(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .wrapContentWidth()
    ) {
        items(10) {
            CatalogChips(
                onClick = {},
                icon = Icons.Outlined.Star,
                title = "Chair",
                contentDescription = "Chair",
                isActive = true
            )
        }
    }
}