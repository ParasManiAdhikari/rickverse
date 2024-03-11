package com.androidfactory.simplerick.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.androidfactory.simplerick.ui.theme.RickAction

@Composable
fun CharacterEpisodeScreen(characterId: Int) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "Episodes of Character : $characterId", fontSize = 28.sp, color = RickAction)
    }
}