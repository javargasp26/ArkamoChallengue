package com.example.arkamochallengue.core.di

import com.example.arkamochallengue.core.remote.RetrofitProvider
import com.example.arkamochallengue.data.repositoryimpl.CharacterRepositoryImpl
import com.example.arkamochallengue.domain.usecase.GetCharactersUseCase


object AppModule {

    private val repository by lazy {
        CharacterRepositoryImpl(
            api = RetrofitProvider.api
        )
    }

    val getCharactersUseCase by lazy {
        GetCharactersUseCase(repository)
    }
}