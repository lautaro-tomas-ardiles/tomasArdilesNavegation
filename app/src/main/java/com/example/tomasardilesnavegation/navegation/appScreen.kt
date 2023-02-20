package com.example.tomasardilesnavegation.navegation

sealed class appScreen(val route : String){

    object FirstScreen: appScreen("first_screen")
    object SecondScreen: appScreen("second_screen")

}