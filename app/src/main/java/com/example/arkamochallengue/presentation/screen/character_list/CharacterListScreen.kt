package com.example.arkamochallengue.presentation.screen.character_list

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.arkamochallengue.presentation.viewmodel.character_list.CharacterListViewModel

@Composable
fun CharacterListScreen(
    viewModel: CharacterListViewModel = viewModel()
) {

    val state by viewModel.state.collectAsState()

    CharacterListContent(
        state = state,
        onRetry = viewModel::getCharacters
    )
}