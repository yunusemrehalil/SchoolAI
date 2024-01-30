package com.nomaddeveloper.schoolai.sections

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Hail
import androidx.compose.material.icons.rounded.Numbers
import androidx.compose.material.icons.rounded.TextFields
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nomaddeveloper.schoolai.data.PracticeModel
import com.nomaddeveloper.schoolai.items

val practiceModel: List<PracticeModel> = listOf(
    PracticeModel(
        icon = Icons.Rounded.Numbers,
        title = "Math",
        goal = 17
    ),
    PracticeModel(
        icon = Icons.Rounded.TextFields,
        title = "Turkish",
        goal = 61
    ),
    PracticeModel(
        icon = Icons.Rounded.Hail,
        title = "History",
        goal = 61
    )


)
@Preview
@Composable
fun PersonalGoalsSection() {
    LazyVerticalGrid(columns = GridCells.Fixed(2)){
        items(practiceModel.size){
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(8.dp)) {
                Icon(imageVector = practiceModel[it].icon, contentDescription = null)
                Text(text = practiceModel[it].title)
                Text(text = "${practiceModel[it].goal} / 123")
            }
        }
    }
}