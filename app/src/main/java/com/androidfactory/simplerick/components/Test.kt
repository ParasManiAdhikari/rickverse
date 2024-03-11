package com.androidfactory.simplerick.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CenteredLazyColumn(items: List<String>) {
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally, // Align items vertically at the center
        modifier = Modifier.fillMaxSize()
    ) {
        items(items) { item ->
            Text(
                text = item,
                modifier = Modifier
                    .padding(8.dp)
            )
        }
    }
}

@Preview
@Composable
fun PreviewCenteredLazyColumn() {
    val items = listOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5")
    CenteredLazyColumn(items = items)
}
