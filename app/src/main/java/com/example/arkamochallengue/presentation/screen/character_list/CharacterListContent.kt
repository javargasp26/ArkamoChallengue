package com.example.arkamochallengue.presentation.screen.character_list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.arkamochallengue.core.ui.theme.ArkamoChallengueTheme
import com.example.arkamochallengue.domain.model.CharacterModel

@Composable
fun CharacterListContent(
    state: CharacterListState,
    onRetry: () -> Unit
) {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        when {

            state.isLoading -> {

                CircularProgressIndicator()
            }

            state.error != null -> {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    Text(
                        text = state.error
                    )

                    Button(
                        onClick = onRetry
                    ) {

                        Text(
                            text = "Retry"
                        )
                    }
                }
            }

            else -> {

                Text(
                    text = "Characters loaded: ${state.characters.size}"
                )
            }
        }
    }
}


@Preview(
    showBackground = true,
    name = "Loading"
)
@Composable
fun CharacterListLoadingPreview() {

    ArkamoChallengueTheme {

        CharacterListContent(
            state = CharacterListState(
                isLoading = true
            ),
            onRetry = {}
        )
    }
}

@Preview(
    showBackground = true,
    name = "Error"
)
@Composable
fun CharacterListErrorPreview() {

    ArkamoChallengueTheme {

        CharacterListContent(
            state = CharacterListState(
                error = "Something went wrong"
            ),
            onRetry = {}
        )
    }
}

@Preview(
    showBackground = true,
    name = "Success"
)
@Composable
fun CharacterListSuccessPreview() {

    ArkamoChallengueTheme {

        CharacterListContent(
            state = CharacterListState(
                characters = listOf(
                    CharacterModel(
                        id = 1,
                        name = "Rick Sanchez",
                        status = "Alive",
                        image = ""
                    )
                )
            ),
            onRetry = {}
        )
    }
}