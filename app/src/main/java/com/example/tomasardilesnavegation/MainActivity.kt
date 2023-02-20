 package com.example.tomasardilesnavegation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tomasardilesnavegation.screens.FristScreen
import com.example.tomasardilesnavegation.ui.theme.TomasArdilesNavegationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TomasArdilesNavegationTheme {
                Surface(color = MaterialTheme.colors.background) {
                    FristScreen()
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TomasArdilesNavegationTheme {
        FristScreen()
    }
}