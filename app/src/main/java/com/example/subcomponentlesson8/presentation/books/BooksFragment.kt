package com.example.subcomponentlesson8.presentation.books

import android.os.Bundle
import com.example.subcomponentlesson8.App
import com.example.subcomponentlesson8.di.BooksSubcomponent
import moxy.MvpAppCompatFragment
import moxy.presenter.ProvidePresenter

class BooksFragment : MvpAppCompatFragment(), BooksView {
    //...
    lateinit var booksSubcomponent: BooksSubcomponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        booksSubcomponent = App.instance.initBooksSubcomponent()!!
    }

    @ProvidePresenter
    fun providePresenter() = BooksPresenter().apply {
//...
        booksSubcomponent.inject(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        App.instance.destroyBooksSubcomponent()
    }
//...
}