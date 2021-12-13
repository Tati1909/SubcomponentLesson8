package com.example.subcomponentlesson8.repository

import com.example.subcomponentlesson8.model.Author
import io.reactivex.rxjava3.core.Single

/**
 * Пусть на некотором этапе использования приложения пользователь попадает на
фрагмент со списком авторов книг, а по клику на элемент списка отображается фрагмент со списком
книг этого автора. За получение авторов будет отвечать некий AuthorsRepository
 */
class AuthorsRepository : IAuthorsRepository {

    override fun getAuthors(): Single<List<Author>> {
        TODO()
    }
}