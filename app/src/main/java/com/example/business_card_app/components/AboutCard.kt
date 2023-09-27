package com.example.business_card_app.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

@Composable
fun AboutCard(text: String, modifier: Modifier = Modifier) {
    Card(
        elevation = CardDefaults.cardElevation(5.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.DarkGray,
        ),
        modifier = Modifier
            .fillMaxWidth()

        ) {
        Column(            modifier = Modifier.padding(12.dp)) {
            Text(
                "ABOUT  ME",
                modifier = Modifier.padding(bottom = 16.dp),
                style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight.ExtraBold,
                    textAlign = TextAlign.Right,
                    color = Color.White
                )
            )

            Text(
                text,
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 1.8.em,
                    color = Color.White,
                    textAlign = TextAlign.Justify,

                )
            )
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xffffff,)
@Composable
fun AboutCardPreview() {
    val text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse venenatis suscipit orci. Duis nibh enim, volutpat non condimentum ac, vulputate id odio."
    AboutCard(text)
}