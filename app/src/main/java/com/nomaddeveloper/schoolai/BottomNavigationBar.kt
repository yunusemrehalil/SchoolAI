package com.nomaddeveloper.schoolai

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nomaddeveloper.schoolai.data.BottomNavigationModel

val items: List<BottomNavigationModel> = listOf(
    BottomNavigationModel(
        title = "Home",
        icon = Icons.Rounded.Home
    ),
    BottomNavigationModel(
        title = "Settings",
        icon = Icons.Rounded.Settings
    ),
    BottomNavigationModel(
        title = "Account",
        icon = Icons.Rounded.AccountCircle
    )
)
@Preview
@Composable
fun BottomNavigationBar() {
    NavigationBar {
        Row(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.inverseOnSurface)
        ) {
            items.forEachIndexed { index, bottomNavigationData ->
                NavigationBarItem(selected = index ==0,
                    onClick = { /*TODO*/ },
                    icon = { Icon(
                        imageVector = bottomNavigationData.icon,
                        contentDescription = bottomNavigationData.title,
                        tint = MaterialTheme.colorScheme.onBackground
                    ) },
                    label = {
                        Text(text = bottomNavigationData.title,
                            color = MaterialTheme.colorScheme.onBackground)
                    })
            }
        }
    }
}