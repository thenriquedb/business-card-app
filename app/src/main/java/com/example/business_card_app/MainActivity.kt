package com.example.business_card_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.business_card_app.components.Header
import com.example.business_card_app.components.SocialMediaButton
import com.example.business_card_app.ui.theme.BusinesscardappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val image = painterResource(id = R.drawable.avatar)

            Column(modifier = Modifier
                .fillMaxSize()
                .background(Color.Black) ) {
                    Header(
                        name = "Thiago Henrique Domingues",
                        role="Software developer",
                        image = image
                    )

                    Row(
                        modifier = Modifier.padding(32.dp, top=16.dp),
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        SocialMediaButton(painter = painterResource(id = R.drawable.whatsapp), contentDescription = "Whatsapp" )
                        SocialMediaButton(painter = painterResource(id = R.drawable.email), contentDescription = "Email" )
                        SocialMediaButton(painter = painterResource(id = R.drawable.linkedin), contentDescription = "Linkedin" )
                        SocialMediaButton(painter = painterResource(id = R.drawable.github), contentDescription = "Github" )
                    }

            }
        }
    }
}