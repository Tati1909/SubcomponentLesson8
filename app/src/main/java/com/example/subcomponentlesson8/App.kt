package com.example.subcomponentlesson8

import android.app.Application
import com.example.subcomponentlesson8.di.AppComponent
import com.example.subcomponentlesson8.di.AuthorsSubcomponent
import com.example.subcomponentlesson8.di.BooksSubcomponent
import com.example.subcomponentlesson8.di.DaggerAppComponent
import timber.log.Timber

class App : Application() {

    companion object {
        lateinit var instance: App
    }

    lateinit var appComponent: AppComponent
        private set

    private var authorsSubcomponent: AuthorsSubcomponent? = null
        private set

    private var booksSubcomponent: BooksSubcomponent? = null
        private set

    // ...
    override fun onCreate() {
        super.onCreate()

        instance = this
        Timber.plant(Timber.DebugTree())

        appComponent = DaggerAppComponent
            .builder()
            .build()
// ...
    }

    fun initAuthorsSubcomponent() = appComponent.authorsSubcomponent().also {
        authorsSubcomponent = it
    }

    fun destroyAuthorsSubcomponent() {
        authorsSubcomponent = null
    }

    fun initBooksSubcomponent() =
        authorsSubcomponent
            ?.booksSubcomponent()
            .also { subcomponent ->
                booksSubcomponent = subcomponent
            }

    fun destroyBooksSubcomponent() {
        booksSubcomponent = null
    }
// ...
}