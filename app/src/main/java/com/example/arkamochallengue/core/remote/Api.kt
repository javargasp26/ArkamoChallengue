package com.example.arkamochallengue.core.remote

import com.example.arkamochallengue.data.remote.dto.CharacterDto
import com.example.arkamochallengue.data.remote.dto.CharacterResponseDto
import retrofit2.http.GET

interface Api {

    @GET("character")
    suspend fun getCharacters(): CharacterResponseDto

}