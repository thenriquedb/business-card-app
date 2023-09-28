package com.example.business_card_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.business_card_app.components.AboutCard
import com.example.business_card_app.components.Header
import com.example.business_card_app.components.SocialMediaButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val image = painterResource(id = R.drawable.avatar)

            Column(modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)

            ) {
                    Header(
                        name = "Thiago Henrique Domingues",
                        role="Software developer",
                        image = image
                    )

                    Row(
                        modifier = Modifier.padding(32.dp),
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        SocialMediaButton(
                            painter = painterResource(id = R.drawable.whatsapp),
                            onClickLabel = "Send Whatsapp message",
                            uri ="https://wa.me/55999999999?text=Hello",
                        )

                        SocialMediaButton(
                            painter = painterResource(id = R.drawable.email),
                            onClickLabel = "Send Email",
                            uri = "mailto:any_email@gmail.com"
                        )

                        SocialMediaButton(
                            painter = painterResource(id = R.drawable.linkedin),
                            onClickLabel = "Open Linkedin profile",
                            uri = "https://www.linkedin.com/in/thenriquedomingues/"
                        )

                        SocialMediaButton(
                            painter = painterResource(id = R.drawable.github),
                            onClickLabel = "Open Github profile",
                            uri = "https://github.com/thenriquedb"
                        )

                    }

                    Box(modifier = Modifier.padding(horizontal = 32.dp)) {
                        AboutCard(text = "React and React Native developer with nearly 4 years of experience, nearing completion of a degree in Computer Science, and actively studying native Android development with Kotlin.\"",)
                    }
            }
        }
    }
}