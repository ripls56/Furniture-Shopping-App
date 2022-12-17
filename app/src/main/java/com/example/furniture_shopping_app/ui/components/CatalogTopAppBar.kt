package com.example.furniture_shopping_app.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.PlatformParagraphStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.furniture_shopping_app.ui.theme.PoppinsFamily
import com.example.furniture_shopping_app.ui.theme.Sub

@Composable
fun CatalogTopAppBar(
    onLeadingIconClick: () -> Unit = {},
    onTrailingIconClick: () -> Unit = {},
){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        IconButton(onClick = onLeadingIconClick) {
            Icon(
                Icons.Filled.Search,
                contentDescription = "Search",
                tint = Sub
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                fontFamily = PoppinsFamily,
                fontSize = 13.sp,
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
                        append("MAKE HOME")
                    }
                }
            )
            Text(
                fontFamily = PoppinsFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Sub,
                text = buildAnnotatedString {
                    withStyle(
                        style = ParagraphStyle(
                            lineHeightStyle = LineHeightStyle(
                                alignment = LineHeightStyle.Alignment.Bottom,
                                trim = LineHeightStyle.Trim.LastLineBottom
                            ),
                            platformStyle = PlatformParagraphStyle(includeFontPadding = false)
                        )
                    ){
                        append("BEAUTIFUL")
                    }
                }
            )
        }
        IconButton(onClick = onTrailingIconClick) {
            Icon(
                Icons.Filled.ShoppingCart,
                contentDescription = "ShoppingCart",
                tint = Sub
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun AppBarPreview() {
    CatalogTopAppBar()
}