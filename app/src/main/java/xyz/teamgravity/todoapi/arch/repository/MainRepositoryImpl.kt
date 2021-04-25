package xyz.teamgravity.todoapi.arch.repository

import retrofit2.Response
import xyz.teamgravity.todoapi.arch.api.ToDoApi
import xyz.teamgravity.todoapi.model.ToDoModel

class MainRepositoryImpl(
    private val api: ToDoApi
): MainRepository {

    override suspend fun getToDos(): List<ToDoModel> = api.retrieveToDos()
}