package com.example.business_card_app.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Header() {
    Text(text = "Hello my friend")
}

@Preview(showBackground = true)
@Composable
fun HeaderPreview() {
    Header()
}