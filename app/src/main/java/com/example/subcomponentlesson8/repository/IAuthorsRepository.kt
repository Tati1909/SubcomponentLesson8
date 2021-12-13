package com.example.subcomponentlesson8.repository

import com.example.subcomponentlesson8.model.Author
import io.reactivex.rxjava3.core.Single

interface IAuthorsRepository {
    fun getAuthors(): Single<List<Author>>
}