package com.example.arkamochallengue.data.repositoryimpl

import com.example.arkamochallengue.core.remote.Api
import com.example.arkamochallengue.data.remote.mapper.toCharacterModel
import com.example.arkamochallengue.domain.model.CharacterModel
import com.example.arkamochallengue.domain.repository.CharacterRepository


class CharacterRepositoryImpl(
    private val api: Api
) : CharacterRepository {

    override suspend fun getCharacters(): List<CharacterModel> {

        return api
            .getCharacters()
            .results
            .map { dto ->
                dto.toCharacterModel()
            }
    }
}