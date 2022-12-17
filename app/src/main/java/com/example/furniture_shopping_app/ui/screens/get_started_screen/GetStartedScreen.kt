package com.example.furniture_shopping_app.ui.screens.get_started_screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.furniture_shopping_app.R
import com.example.furniture_shopping_app.ui.theme.Black80
import com.example.furniture_shopping_app.ui.theme.FurnitureShoppingAppTheme
import com.example.furniture_shopping_app.ui.theme.PoppinsFamily
import com.example.furniture_shopping_app.ui.theme.Sub

private const val titleText = "The best simple place where you" +
        "discover most wonderful furnitures and" +
        "make your home beautiful"

private const val mainText = "MAKE YOUR\nHOME BEAUTIFUL"


@Preview
@Composable
fun GetStarted(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
        horizontalAlignment = Start,
        modifier = Modifier
            .paint(
                painterResource(id = R.drawable.get_started_background),
                contentScale = ContentScale.FillHeight
            )
            .padding(horizontal = 32.dp, vertical = 62.dp)
        ){
            Spacer(modifier = Modifier.height(20.dp))
            MainText(text = mainText)
            Spacer(modifier = Modifier.height(20.dp))
            TitleText(text = titleText)
            Spacer(modifier = Modifier.fillMaxHeight(0.90f))
            Column(
                horizontalAlignment = CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                GetStartedButton()
            }
        }
    }
}

@Composable
private fun MainText(text: String){
    Text(
        text = text,
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = PoppinsFamily,
        lineHeight = 35.sp,
        color = Black80
    )
}

@Composable
private fun TitleText(text: String){
    Text(
        text = text,
        fontSize = 16.sp,
        fontFamily = PoppinsFamily,
        fontWeight = FontWeight.Normal,
        color = Sub,
        overflow = TextOverflow.Ellipsis
    )
}

@Composable
private fun GetStartedButton(){
    FurnitureShoppingAppTheme {
        ElevatedButton(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(66.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = Color.White
            ),
            shape = ShapeDefaults.ExtraSmall
        ) {
            Text(
                text = "Get Started",
                fontFamily = PoppinsFamily,
                fontSize = 18.sp
            )
        }
    }
}
