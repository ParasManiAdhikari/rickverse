package com.androidfactory.simplerick.components.common

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.androidfactory.simplerick.ui.theme.RickAction
import com.androidfactory.simplerick.ui.theme.RickTextPrimary

data class DataPoint(
    val title: String,
    val description: String
)

@Composable
fun DataPointComponent(dataPoint: DataPoint) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = dataPoint.title,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = RickAction
        )
        Text(
            text = dataPoint.description,
            fontSize = 24.sp,
            color = RickTextPrimary
        )
    }
}

@Preview
@Composable
fun DataPointComponentPreview() {
    val data = DataPoint(title = "Last known location", description = "Citadel of Ricks")
    DataPointComponent(dataPoint = data)
}