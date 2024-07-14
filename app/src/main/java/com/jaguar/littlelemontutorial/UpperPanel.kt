    package com.jaguar.littlelemontutorial

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jaguar.littlelemontutorial.ui.theme.LittleLemonTutorialTheme


@Composable
fun UpperPanel(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = modifier
            .fillMaxWidth()
            .background(colorResource(id = R.color.olive))
    ) {
        Text(
            text = "Little Lemon",
            fontSize = 32.sp,
            color = colorResource(id = R.color.yellow),
            modifier = Modifier.padding(20.dp, 20.dp, 0.dp, 0.dp)
        )
        Text(
            text = "Chicago",
            fontSize = 32.sp,
            color = colorResource(id = R.color.white),
            modifier = Modifier.padding(20.dp, 0.dp, 0.dp, 0.dp)
        )
        Row(
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Text(
                text = stringResource(id = R.string.description),
                fontSize = 21.sp,
                color = colorResource(id = R.color.white),
                modifier = Modifier.width(200.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.chef),
                contentDescription = "",
                modifier = Modifier
                    .height(200.dp)
                    .clip(RoundedCornerShape(20.dp))
            )
        }
        Button(
            onClick = {
                Toast.makeText(context, "Order received. Thank you!", Toast.LENGTH_SHORT).show()
            },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.yellow)
            ),
            modifier = Modifier.padding(horizontal = 20.dp)
        ) {
            Text(
                text = "Order Take Away",
                fontSize = 18.sp,
                color = colorResource(id = R.color.black),
                fontWeight = FontWeight.Bold
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun UpperPanelPreview() {
    LittleLemonTutorialTheme {
        UpperPanel()
    }
}