@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.furniture_shopping_app.ui.screens.registration_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.furniture_shopping_app.navigation.Screen
import com.example.furniture_shopping_app.ui.components.SofaPicture
import com.example.furniture_shopping_app.ui.theme.Black80
import com.example.furniture_shopping_app.ui.theme.FurnitureShoppingAppTheme
import com.example.furniture_shopping_app.ui.theme.PoppinsFamily


private const val mainText = "WELCOME"


@Composable
fun RegistrationScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(vertical = 50.dp, horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //Sofa picture on top of the screen
        SofaPicture()
        Spacer(modifier = Modifier.height(30.dp))
        //Main text below sofa
        MainText(text = mainText)
        Spacer(modifier = Modifier.height(30.dp))
        Surface(
            shape = ShapeDefaults.Medium,
            shadowElevation = 2.dp
        ) {
            Column(
                modifier = Modifier
                    .padding(horizontal = 15.dp, vertical = 8.dp)
                    .wrapContentHeight(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                //Email input
                EmailInputText()
                Spacer(modifier = Modifier.height(10.dp))
                //Password input
                PasswordInputText()
                Spacer(modifier = Modifier.height(10.dp))
                //Confirm password input
                ConfirmPasswordInputText()
                Spacer(modifier = Modifier.height(10.dp))
                //Registration button
                RegistrationButton()
                Spacer(modifier = Modifier.height(10.dp))
                //Sign In button
                SignInButton(navController = navController)
                Spacer(modifier = Modifier.height(5.dp))
            }
        }
    }
}

@Composable
private fun MainText(text: String) {
    Text(
        text = text,
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 35.sp,
        color = Black80,
        textAlign = TextAlign.Center,
        letterSpacing = 1.sp
    )
}

@Composable
private fun EmailInputText(){
    val login = remember{ mutableStateOf("") }
    OutlinedTextField(
        value = login.value,
        onValueChange = {
            login.value = it
        },
        modifier = Modifier
            .fillMaxWidth()
            .height(66.dp),
        isError = false,
        label = {
            Text(text = "Email")
        },
        singleLine = true,
    )
}

@Composable
private fun PasswordInputText(){
    val password = remember{ mutableStateOf("") }
    var passwordVisibility = remember { mutableStateOf(false) }
    FurnitureShoppingAppTheme {
        OutlinedTextField(
            value = password.value,
            onValueChange = {
                password.value = it
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(66.dp),
            isError = false,
            label = {
                Text(text = "Password")
            },
            singleLine = true,
            visualTransformation = if (passwordVisibility.value) VisualTransformation.None else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),
            trailingIcon = {
                IconButton(
                    onClick = {
                        passwordVisibility.value = !passwordVisibility.value
                    },
                    colors = IconButtonDefaults.iconButtonColors(
                        contentColor = MaterialTheme.colorScheme.primary
                    )
                ) {
                    if (passwordVisibility.value)
                        Icon(Icons.Filled.VisibilityOff, contentDescription = "")
                    else Icon(Icons.Filled.Visibility, contentDescription = "")
                }
            },
        )
    }
}

@Composable
private fun ConfirmPasswordInputText(){
    val password = remember{ mutableStateOf("") }
    var passwordVisibility = remember { mutableStateOf(false) }
    FurnitureShoppingAppTheme {
        OutlinedTextField(
            value = password.value,
            onValueChange = {
                password.value = it
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(66.dp),
            isError = false,
            label = {
                Text(text = "Confirm Password")
            },
            singleLine = true,
            visualTransformation = if (passwordVisibility.value) VisualTransformation.None else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),
            trailingIcon = {
                IconButton(
                    onClick = {
                        passwordVisibility.value = !passwordVisibility.value
                    },
                    colors = IconButtonDefaults.iconButtonColors(
                        contentColor = MaterialTheme.colorScheme.primary
                    )
                ) {
                    if (passwordVisibility.value)
                        Icon(Icons.Filled.VisibilityOff, contentDescription = "")
                    else Icon(Icons.Filled.Visibility, contentDescription = "")
                }
            },
        )
    }
}

@Composable
private fun RegistrationButton(){
    ElevatedButton(
        onClick = {},
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Black80,
            contentColor = Color.White
        ),
        shape = ShapeDefaults.ExtraSmall,
        contentPadding = PaddingValues(0.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.wrapContentSize()
        ){
            Text(
                text = "Registration",
                fontFamily = PoppinsFamily,
                fontSize = 16.sp,
            )
        }
    }
}

@Composable
private fun SignInButton(navController: NavController){
    FurnitureShoppingAppTheme {
        TextButton(
            onClick = {
                navController.navigate(Screen.Login.route)
            },
            shape = ShapeDefaults.ExtraSmall
        ) {
            Box(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
            ){
                Text(
                    buildAnnotatedString {
                        append(text = "Already have account? ")
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Bold
                            )
                        ){
                            append(text = "Sign In")
                        }
                    },
                    style = TextStyle(
                        fontFamily = PoppinsFamily,
                    ),
                )
            }
        }
    }
}
