package com.example.business_card_app.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.business_card_app.R

@Composable
fun Header(name:String, role: String, image: Painter, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .background(Color.Yellow)
            .fillMaxWidth()
            .fillMaxHeight(0.5f)
        ) {
        Image(
            painter = image,
            contentScale = ContentScale.Crop,
            contentDescription = "$name avatar",
            modifier = Modifier.fillMaxSize()
        )

        Box(modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(Color.Transparent, Color.Black),
                    startY = 500f
                )
            )
        )

        Box(
            modifier = Modifier
                .padding(32.dp, bottom = 0.dp)
                .fillMaxSize(),
            contentAlignment = Alignment.BottomStart,

        ) {
            Column {
                Text(
                    text = name.uppercase(),
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                    )
                )

                Text(
                    text = role,
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                    )
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HeaderPreview() {
    val image = painterResource(id = R.drawable.avatar)
    Header(
        "Thiago Henrique Domingues",
        image=image,
        role = "Software developer"
    )
}