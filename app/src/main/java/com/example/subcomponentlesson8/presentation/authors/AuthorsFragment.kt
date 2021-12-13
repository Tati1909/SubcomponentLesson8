package com.example.subcomponentlesson8.presentation.authors

import android.os.Bundle
import com.example.subcomponentlesson8.App
import com.example.subcomponentlesson8.di.AuthorsSubcomponent
import moxy.MvpAppCompatFragment
import moxy.presenter.ProvidePresenter

class AuthorsFragment : MvpAppCompatFragment(), AuthorsView {
    //...
    lateinit var authorsSubcomponent: AuthorsSubcomponent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        authorsSubcomponent = App.instance.initAuthorsSubcomponent()
    }

    @ProvidePresenter
    fun providePresenter() = AuthorsPresenter().apply {
//...
        authorsSubcomponent.inject(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        App.instance.destroyAuthorsSubcomponent()
    }
}