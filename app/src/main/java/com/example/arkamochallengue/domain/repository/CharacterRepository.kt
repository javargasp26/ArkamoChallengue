package com.example.arkamochallengue.domain.repository

import com.example.arkamochallengue.domain.model.CharacterModel

interface CharacterRepository {

    suspend fun getCharacters(): List<CharacterModel>

}