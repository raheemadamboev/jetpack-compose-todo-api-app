package xyz.teamgravity.todoapi.arch.api

import retrofit2.Response
import retrofit2.http.GET
import xyz.teamgravity.todoapi.model.ToDoModel


interface ToDoApi {
    companion object {
        const val BASE_URL = "https://jsonplaceholder.typicode.com"
    }

    @GET("/todos")
    suspend fun retrieveToDos(): List<ToDoModel>
}