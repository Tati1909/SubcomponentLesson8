package com.example.subcomponentlesson8.di

import com.example.subcomponentlesson8.annotation.BooksScope
import com.example.subcomponentlesson8.di.modules.BooksRepositoryModule
import com.example.subcomponentlesson8.presentation.books.BooksPresenter
import dagger.Subcomponent

@BooksScope
@Subcomponent(
    modules = [
        BooksRepositoryModule::class
    ]
)
interface BooksSubcomponent {
    fun inject(booksPresenter: BooksPresenter)
}