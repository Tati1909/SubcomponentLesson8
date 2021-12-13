package com.example.subcomponentlesson8.di

import com.example.subcomponentlesson8.annotation.AuthorsScope
import com.example.subcomponentlesson8.di.modules.AuthorsRepositoryModule
import com.example.subcomponentlesson8.presentation.authors.AuthorsPresenter
import dagger.Subcomponent

@AuthorsScope
@Subcomponent(
    modules = [
        AuthorsRepositoryModule::class
    ]
)
interface AuthorsSubcomponent {
    /**
     * Не попав на экран авторов, мы не попадём на экран книг, а значит, при уничтожении субкомпонента
    авторов требуется уничтожать и субкомпонент книг. Поэтому помещаем субкомпонент книг в
    субкомпонент авторов.
     */
    fun booksSubcomponent(): BooksSubcomponent

    fun inject(authorsPresenter: AuthorsPresenter)
}