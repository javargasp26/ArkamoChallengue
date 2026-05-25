package com.example.arkamochallengue.data.remote.mapper

import com.example.arkamochallengue.data.remote.dto.CharacterDto
import com.example.arkamochallengue.domain.model.CharacterModel

fun CharacterDto.toCharacter(): CharacterModel {
    return CharacterModel(
        id = id,
        image = image,
        name = name,
        status = status
    )
}