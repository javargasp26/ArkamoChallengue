package com.example.arkamochallengue.presentation.screen.character_list

import com.example.arkamochallengue.domain.model.CharacterModel

data class CharacterListState(
    val isLoading: Boolean = false,
    val characters: List<CharacterModel> = emptyList(),
    val error: String? = null
)