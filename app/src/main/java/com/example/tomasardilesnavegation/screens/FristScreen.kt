package com.example.tomasardilesnavegation.screens
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.tomasardilesnavegation.navegation.appScreen

@Composable
fun FristScreen(navController: NavController){
    Scaffold (topBar = {
        TopAppBar() {
            Text(text = "FristScreen")
        }
    }) {
        bodyContent(navController)
    }
}
@Composable
fun bodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(" hola navegacion")
        Button(onClick = {
            navController.navigate(route = appScreen.SecondScreen.route)
        }) {
            Text("navega")
        }
    }
}