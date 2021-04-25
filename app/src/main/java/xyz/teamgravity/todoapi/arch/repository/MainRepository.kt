package xyz.teamgravity.todoapi.arch.repository

import retrofit2.Response
import xyz.teamgravity.todoapi.model.ToDoModel

interface MainRepository {

    suspend fun getToDos(): List<ToDoModel>
}