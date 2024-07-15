package com.jaguar.littlelemontutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jaguar.littlelemontutorial.helpers.homeScreen
import com.jaguar.littlelemontutorial.helpers.login
import com.jaguar.littlelemontutorial.helpers.welcome
import com.jaguar.littlelemontutorial.screens.HomeScreen
import com.jaguar.littlelemontutorial.screens.LoginPanel
import com.jaguar.littlelemontutorial.screens.Welcome

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyNavigation()
        }
    }
}

@Composable
fun MyNavigation() {
    val navController = rememberNavController()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    NavHost(navController = navController, startDestination = welcome.route) {
        composable(welcome.route) {
            Welcome(drawerState = drawerState, scope = scope, navController = navController)
        }
        composable(login.route) {
            LoginPanel(drawerState = drawerState, scope = scope, navController = navController)
        }
        composable(homeScreen.route) {
            HomeScreen(drawerState = drawerState, scope = scope, navController = navController)
        }
    }
}