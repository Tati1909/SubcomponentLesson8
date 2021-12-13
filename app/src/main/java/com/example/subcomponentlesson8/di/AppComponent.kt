package com.example.subcomponentlesson8.di

import dagger.Component
import javax.inject.Singleton

/**
 * основной компонент приложения, который предоставит субкомпонент авторов
 */
@Singleton
@Component(
    modules = [
//....
    ]
)
interface AppComponent {
    fun authorsSubcomponent(): AuthorsSubcomponent
//...
}