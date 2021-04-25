package xyz.teamgravity.todoapi.compose.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ToDoCard(
    task: String,
    isChecked: Boolean
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp, top = 4.dp, bottom = 4.dp),
        shape = MaterialTheme.shapes.large,
        elevation = 10.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ) {
            Text(
                modifier = Modifier
                    .fillMaxSize(0.8f)
                    .align(CenterVertically),
                text = task.trim(),
                style = MaterialTheme.typography.h4
            )

            Checkbox(
                checked = isChecked,
                modifier = Modifier
                    .fillMaxSize()
                    .align(CenterVertically),
                onCheckedChange = null,
                colors = CheckboxDefaults.colors(checkedColor = MaterialTheme.colors.primary)
            )
        }
    }
}