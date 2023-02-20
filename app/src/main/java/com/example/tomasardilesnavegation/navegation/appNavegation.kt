package com.example.tomasardilesnavegation.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tomasardilesnavegation.screens.FristScreen
import com.example.tomasardilesnavegation.screens.SecondScreen


@Composable
fun appNavegation() {
    val navController = rememberNavController()
    NavHost(navController = navController , startDestination = appScreen.FirstScreen.route) {
        composable(route = appScreen.FirstScreen.route) {
            FristScreen(navController)
        }
        composable(route = appScreen.SecondScreen.route) {
            SecondScreen(navController)
        }
    }
}