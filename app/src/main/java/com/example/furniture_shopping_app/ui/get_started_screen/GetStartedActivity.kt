package com.example.furniture_shopping_app.ui.get_started_screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.furniture_shopping_app.R
import com.example.furniture_shopping_app.ui.get_started_screen.ui.theme.FurnitureShoppingAppTheme

class GetStartedActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FurnitureShoppingAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GetStarted()
                }
            }
        }
    }


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
                .padding(50.dp)
            ){
                Spacer(modifier = Modifier.height(30.dp))
                MainText(text = "MAKE YOUR\nHOME BEAUTIFUL")
                TitleText(text = "The best simple place where you\n" +
                        "discover most wonderful furnitures and\n" +
                        "make your home beautiful")
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
            fontWeight = FontWeight.Bold
        )
    }

    @Composable
    private fun TitleText(text: String){
        Text(
            text = text,
            fontSize = 16.sp,
        )
    }

    @Composable
    private fun GetStartedButton(){
        ElevatedButton(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text(
                text = "Get Started",
                fontSize = 18.sp
            )
        }
    }
}
