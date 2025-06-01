package com.example.careercompass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.careercompass.ui.theme.CareerCompassTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CareerCompassTheme {
                LoginScreen()
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewFunction(){
    CareerCompassTheme {
        LoginScreen()
    }
}