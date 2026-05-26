package com.example.arkamochallengue.data.remote.mapper

import com.example.arkamochallengue.data.remote.dto.CharacterDto
import com.example.arkamochallengue.domain.model.CharacterModel
import com.example.arkamochallengue.domain.model.CharacterStatus

fun CharacterDto.toCharacterModel(): CharacterModel {

    return CharacterModel(
        id = id,
        image = image,
        name = name,
        status = status.toCharacterStatus()
    )
}

private fun String.toCharacterStatus(): CharacterStatus {

    return when (this.lowercase()) {

        "alive" -> CharacterStatus.ALIVE

        "dead" -> CharacterStatus.DEAD

        else -> CharacterStatus.UNKNOWN
    }
}