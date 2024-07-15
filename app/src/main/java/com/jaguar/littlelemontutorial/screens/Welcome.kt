package com.jaguar.littlelemontutorial.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.jaguar.littlelemontutorial.R
import com.jaguar.littlelemontutorial.components.Drawer
import com.jaguar.littlelemontutorial.components.Header
import com.jaguar.littlelemontutorial.helpers.login
import com.jaguar.littlelemontutorial.ui.theme.LittleLemonTutorialTheme
import kotlinx.coroutines.CoroutineScope

@Composable
fun Welcome(
    modifier: Modifier = Modifier,
    drawerState: DrawerState,
    scope: CoroutineScope,
    navController: NavHostController
) {
    LittleLemonTutorialTheme {
        Drawer(drawerState) {
            Scaffold(
                modifier = Modifier.fillMaxSize(),
                topBar = { Header(drawerState, scope) },

                ) { innerPadding ->
                Box(
                    modifier = modifier
                        .fillMaxSize()
                        .padding(innerPadding),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.logo),
                            contentDescription = "logo",
                            modifier = Modifier.padding(8.dp)
                        )
                        Text(
                            text = "Welcome to",
                            color = colorResource(id = R.color.yellow),
                            fontSize = 30.sp,
                            textAlign = TextAlign.Center,
                            lineHeight = 50.sp,
                        )
                        Text(
                            text = "Little Lemon",
                            color = colorResource(id = R.color.yellow),
                            fontSize = 40.sp,
                            textAlign = TextAlign.Center,
                            lineHeight = 50.sp,
                        )
                        Button(
                            onClick = {
                                navController.navigate(login.route)
                            },
                            modifier = Modifier.padding(16.dp),
                            colors = ButtonColors(
                                containerColor = colorResource(id = R.color.yellow),
                                contentColor = colorResource(id = R.color.black),
                                disabledContentColor = colorResource(id = R.color.white),
                                disabledContainerColor = colorResource(id = R.color.black),

                                ),
                        ) {
                            Text(
                                text = "Sign In",
                                color = colorResource(id = R.color.black)
                            )
                        }
                    }
                }
            }
        }
    }
}
