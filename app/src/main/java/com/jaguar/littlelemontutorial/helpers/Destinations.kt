package com.jaguar.littlelemontutorial.helpers

interface Destinations {
    val route: String
}

object welcome : Destinations {
    override val route = "Welcome"
}

object homeScreen : Destinations {
    override val route = "HomeScreen"
}

object login : Destinations {
    override val route = "Login"
}