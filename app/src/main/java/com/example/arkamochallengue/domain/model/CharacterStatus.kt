package com.example.arkamochallengue.domain.model

enum class CharacterStatus {
    ALIVE,
    DEAD,
    UNKNOWN
}

fun CharacterStatus.displayName(): String {

    return when (this) {
        CharacterStatus.ALIVE -> "Alive"
        CharacterStatus.DEAD -> "Dead"
        CharacterStatus.UNKNOWN -> "Unknown"
    }
}