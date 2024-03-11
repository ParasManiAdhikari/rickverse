package com.androidfactory.simplerick.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.androidfactory.network.KtorClient
import com.androidfactory.network.models.domain.Character
import com.androidfactory.simplerick.components.common.CharacterImage

@Composable
fun CharacterEpisodeScreen(characterId: Int, ktorClient: KtorClient) {
    var character by remember { mutableStateOf<Character?>(null) }

    LaunchedEffect(key1 = Unit, block = {
        character = ktorClient.getCharacter(characterId)
    })

    character?.let {
        MainScreen(character = it)
    }
}

@Composable
fun MainScreen(
    character: Character
) {
    LazyColumn {
        item { CharacterImage(imageurl = character!!.imageUrl) }
    }
}

@Preview
@Composable
private fun PreviewMainScreen() {
//    MainScreen()
}