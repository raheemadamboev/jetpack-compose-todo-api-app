package xyz.teamgravity.todoapi.injection

import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import xyz.teamgravity.todoapi.arch.api.ToDoApi
import xyz.teamgravity.todoapi.arch.repository.MainRepository
import xyz.teamgravity.todoapi.arch.repository.MainRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApplicationModule {

    @Singleton
    @Provides
    fun provideToDoApi(): ToDoApi = Retrofit.Builder()
        .baseUrl(ToDoApi.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
        .build()
        .create(ToDoApi::class.java)

    @Singleton
    @Provides
    fun provideMainRepository(api: ToDoApi): MainRepository = MainRepositoryImpl(api)
}