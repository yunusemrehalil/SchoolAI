package com.nomaddeveloper.schoolai.sections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nomaddeveloper.schoolai.data.CountdownModel

@Preview
@Composable
fun ExamCountdownSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
    ) {
        Text(
            text = "Exam Countdown",
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        GetExactTime(
            countdownModel = CountdownModel(
                1,
                12,
                16,
                20
            )
        )
    }
}

@Composable
fun GetExactTime(countdownModel: CountdownModel) {
    Row(verticalAlignment = Alignment.Bottom) {
        Text(
            text = countdownModel.days.toString(),
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onBackground,
        )
        Text(
            text = " days ",
            fontSize = 12.sp,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = countdownModel.hours.toString(),
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = " hours ",
            fontSize = 12.sp,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = countdownModel.minutes.toString(),
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = " minutes ",
            fontSize = 12.sp,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = countdownModel.seconds.toString(),
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = " seconds ",
            fontSize = 12.sp,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}