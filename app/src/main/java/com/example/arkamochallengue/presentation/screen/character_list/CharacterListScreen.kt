package com.example.arkamochallengue.presentation.screen.character_list

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.arkamochallengue.presentation.viewmodel.character_list.CharacterListViewModel

@Composable
fun CharacterListScreen(
    viewModel: CharacterListViewModel = viewModel()
) {

    val state by viewModel.state.collectAsState()

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        when {

            state.isLoading -> {
                CircularProgressIndicator()
            }

            state.error != null -> {
                Text(text = state.error!!)
            }

            else -> {
                Text(
                    text = "Characters loaded: ${state.characters.size}"
                )
            }
        }
    }
}