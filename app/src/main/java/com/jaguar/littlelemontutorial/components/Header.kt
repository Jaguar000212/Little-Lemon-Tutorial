package com.jaguar.littlelemontutorial.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.jaguar.littlelemontutorial.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


@Composable
fun HamburgerIcon(modifier: Modifier, state: DrawerState, scope: CoroutineScope) {
    Icon(
        painter = painterResource(R.drawable.hamburger_icon),
        contentDescription = "menu",
        modifier = modifier
            .size(24.dp)
            .clickable {
                scope.launch {
                    state.apply {
                        if (isClosed) open() else close()
                    }
                }
            },
        tint = (colorResource(id = R.color.yellow))
    )
}

@Composable
fun Logo() {
    Image(
        painter = painterResource(R.drawable.watermark),
        contentDescription = "logo",
        modifier = Modifier
            .padding(8.dp)
    )
}

@Composable
fun CartIcon(modifier: Modifier) {
    Icon(
        painter = painterResource(R.drawable.cart), contentDescription = "cart",
        modifier = modifier
            .size(24.dp)
            .clickable { /*TODO*/ },
        tint = (colorResource(id = R.color.yellow))
    )
}

@Composable
fun Header(state: DrawerState, scope: CoroutineScope) {
    Box(
        Modifier
            .height(83.dp)
            .fillMaxWidth()
            .background(color = colorResource(id = R.color.black))
            .padding(top = 20.dp),
        contentAlignment = Alignment.TopCenter

    ) {
        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier.size(63.dp)
            ) {
                HamburgerIcon(Modifier.align(Alignment.Center), state, scope)
            }
            Box(modifier = Modifier.height(63.dp)) {
                Logo()
            }
            Box(
                modifier = Modifier.size(63.dp)
            ) {
                CartIcon(Modifier.align(Alignment.Center))
            }
        }
    }
}