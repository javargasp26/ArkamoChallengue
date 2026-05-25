package com.example.arkamochallengue.core.navigation

sealed class Route(
    val route: String
) {

    data object CharacterList : Route("character_list")
}