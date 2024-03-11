package com.androidfactory.simplerick.components.common

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun CharacterImage(imageurl : String) {
    AsyncImage(
        model = imageurl,
        contentDescription = "Character image",
        modifier = Modifier
            .width(200.dp)
            .aspectRatio(1f)
            .clip(RoundedCornerShape(12.dp)),
    )
    Spacer(modifier = Modifier.height(20.dp))
}