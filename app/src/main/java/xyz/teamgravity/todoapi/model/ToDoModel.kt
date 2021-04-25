package xyz.teamgravity.todoapi.model

import com.google.gson.annotations.SerializedName

data class ToDoModel(

    @SerializedName("userId")
    val userId: Int = 0,

    @SerializedName("id")
    val id: Int = 0,

    @SerializedName("title")
    val title: String = "",

    @SerializedName("completed")
    val completed: Boolean = false
)
