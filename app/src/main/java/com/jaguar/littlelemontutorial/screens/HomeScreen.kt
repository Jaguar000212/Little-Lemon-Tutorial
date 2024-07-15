package com.jaguar.littlelemontutorial.screens


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.jaguar.littlelemontutorial.components.Drawer
import com.jaguar.littlelemontutorial.components.Header
import com.jaguar.littlelemontutorial.components.LowerPanel
import com.jaguar.littlelemontutorial.components.UpperPanel
import com.jaguar.littlelemontutorial.ui.theme.LittleLemonTutorialTheme
import kotlinx.coroutines.CoroutineScope

@Composable
fun HomeScreen(drawerState: DrawerState, scope: CoroutineScope, navController: NavHostController) {
    LittleLemonTutorialTheme {
        Drawer(drawerState) {
            Scaffold(
                modifier = Modifier.fillMaxSize(),
                topBar = { Header(drawerState, scope) },

                ) { innerPadding ->
                Column(modifier = Modifier.padding(innerPadding)) {
                    UpperPanel()
                    LowerPanel()
                }
            }
        }
    }
}
