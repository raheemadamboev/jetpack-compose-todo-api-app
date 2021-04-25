package xyz.teamgravity.todoapi.arch.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import xyz.teamgravity.todoapi.arch.repository.MainRepository
import xyz.teamgravity.todoapi.model.ToDoModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: MainRepository
) : ViewModel() {

    // all todos
    val todos = mutableStateOf<List<ToDoModel>>(emptyList())

    // loading
    val loading = mutableStateOf(false)

    init {
        getTodos()
    }

    private fun getTodos() {
        try {
            viewModelScope.launch {
                loading.value = true

                todos.value = repository.getToDos()

                loading.value = false
            }
        } catch (e: Exception) {
            println("raheem: ${e.message}")
        }
    }
}