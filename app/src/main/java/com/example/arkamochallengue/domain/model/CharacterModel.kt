package com.example.arkamochallengue.domain.model

data class CharacterModel(
    val id: Int,
    val image: String,
    val name: String,
    val status: CharacterStatus,
)