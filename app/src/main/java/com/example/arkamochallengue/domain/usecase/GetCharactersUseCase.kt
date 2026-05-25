package com.example.arkamochallengue.domain.usecase

import com.example.arkamochallengue.domain.repository.CharacterRepository

class GetCharactersUseCase(
    private val repository: CharacterRepository
) {

    suspend operator fun invoke() = repository.getCharacters()
}