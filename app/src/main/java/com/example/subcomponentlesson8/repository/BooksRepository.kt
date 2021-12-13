package com.example.subcomponentlesson8.repository

import com.example.subcomponentlesson8.model.Author
import com.example.subcomponentlesson8.model.Book
import io.reactivex.rxjava3.core.Single


class BooksRepository : IBooksRepository {

    override fun getAuthorBooks(author: Author): Single<List<Book>> {
        TODO()
    }
}