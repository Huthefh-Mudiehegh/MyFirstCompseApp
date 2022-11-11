package com.huthfy.myfirstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.huthfy.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android", "Huthefh")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, phrase: String) {
    Column {
        Text(text = "Hello $name!")
        Text(
            text = phrase,
            fontSize = 12.sp
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyFirstComposeAppTheme {
        Greeting("Compose", "I'm in")
    }
}