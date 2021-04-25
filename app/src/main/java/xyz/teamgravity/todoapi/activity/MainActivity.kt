package xyz.teamgravity.todoapi.activity

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.Modifier
import dagger.hilt.android.AndroidEntryPoint
import xyz.teamgravity.todoapi.arch.viewmodel.MainViewModel
import xyz.teamgravity.todoapi.compose.component.IndefiniteProgressBar
import xyz.teamgravity.todoapi.compose.component.ToDoCard
import xyz.teamgravity.todoapi.compose.theme.AppTheme

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewmodel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            val loading = viewmodel.loading.value

            val todos = viewmodel.todos.value

            AppTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    LazyColumn {
                        itemsIndexed(todos) { index, todo ->
                            if (index == 0) {
                                println("raheem: $index, ${todo.completed}")
                            }
                            ToDoCard(
                                task = todo.title,
                                isChecked = todo.completed
                            )
                        }
                    }

                    IndefiniteProgressBar(isDisplayed = loading)
                }
            }
        }
    }
}