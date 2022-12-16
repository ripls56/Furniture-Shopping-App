package com.example.furniture_shopping_app.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.furniture_shopping_app.R
import com.example.furniture_shopping_app.ui.theme.Black80
import com.example.furniture_shopping_app.ui.theme.FurnitureShoppingAppTheme

class SofaPictureWithDivider{

    @Composable
    fun SofaPicture(){
        Row(modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .wrapContentHeight()
            .fillMaxWidth()
            .padding(horizontal = 15.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {
            CustomDivider(modifier = Modifier.weight(1f))
            Spacer(modifier = Modifier.width(10.dp))
            Image(
                painter = painterResource(id = R.drawable.sofa),
                contentDescription = "Sofa Picture"
            )
            Spacer(modifier = Modifier.width(10.dp))
            CustomDivider(modifier = Modifier.weight(1f))
        }
    }

    @Composable
    private fun CustomDivider(modifier: Modifier){
        Divider(thickness = 1.dp, modifier = modifier, color = Black80)
    }

    @Preview
    @Composable
    private fun SofaPicturePreview(){
        FurnitureShoppingAppTheme {
            SofaPicture()
        }
    }
}