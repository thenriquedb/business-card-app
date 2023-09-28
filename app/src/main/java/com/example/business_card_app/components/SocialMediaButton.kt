package com.example.business_card_app.components


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.business_card_app.R

@Composable
fun SocialMediaButton(
    painter: Painter,
    uri:String = "",
    onClickLabel : String) {
    val uriHandler = LocalUriHandler.current

    fun onClick() {
        uriHandler.openUri(uri)
    }

    Box(
    contentAlignment = Alignment.Center,
    modifier = Modifier
        .background(Color.White, shape = CircleShape)
        .width(50.dp)
        .height(50.dp)
        .clickable(
            onClick = ::onClick,
            onClickLabel = onClickLabel
        )
    ) {
        Icon(
            painter = painter,
            contentDescription = null,
            modifier = Modifier.size(32.dp)
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0x000000)
@Composable
fun SocialMediaButtonPreview() {
    fun onClick() {
        println("Is click!")
    }

    val image = painterResource(id = R.drawable.email)

    Box(modifier = Modifier.padding(12.dp)) {
        SocialMediaButton(painter = image, onClickLabel = "Any button", uri="any_url")
    }
}