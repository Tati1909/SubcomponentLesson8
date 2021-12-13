package com.example.subcomponentlesson8.repository

import com.example.subcomponentlesson8.model.Author
import com.example.subcomponentlesson8.model.Book
import io.reactivex.rxjava3.core.Single

/**
 * За получение книг автора отвечает— BooksRepository
 */
interface IBooksRepository {

    fun getAuthorBooks(author: Author): Single<List<Book>>
}
