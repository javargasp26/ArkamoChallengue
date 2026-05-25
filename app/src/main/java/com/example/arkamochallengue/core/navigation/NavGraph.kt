package com.example.arkamochallengue.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.arkamochallengue.presentation.screen.character_list.CharacterListScreen

@Composable
fun NavGraph(
    navController: NavHostController
) {

    NavHost(
        navController = navController,
        startDestination = Route.CharacterList.route
    ) {

        composable(
            route = Route.CharacterList.route
        ) {

            CharacterListScreen()
        }
    }
}