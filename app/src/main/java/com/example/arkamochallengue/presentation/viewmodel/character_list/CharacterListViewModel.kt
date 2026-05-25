package com.example.arkamochallengue.presentation.viewmodel.character_list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.arkamochallengue.core.di.AppModule
import com.example.arkamochallengue.presentation.screen.character_list.CharacterListState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CharacterListViewModel : ViewModel() {

    private val getCharactersUseCase =
        AppModule.getCharactersUseCase

    private val _state = MutableStateFlow(
        CharacterListState()
    )

    val state: StateFlow<CharacterListState> =
        _state.asStateFlow()

    init {
        getCharacters()
    }

    fun getCharacters() {

        viewModelScope.launch {

            _state.value = CharacterListState(
                isLoading = true
            )

            try {

                val characters =
                    getCharactersUseCase()

                _state.value = CharacterListState(
                    characters = characters
                )

            } catch (e: Exception) {

                _state.value = CharacterListState(
                    error = e.message
                )
            }
        }
    }
}