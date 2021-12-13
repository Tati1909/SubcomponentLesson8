package com.example.subcomponentlesson8.di.modules

import com.example.subcomponentlesson8.annotation.BooksScope
import com.example.subcomponentlesson8.repository.BooksRepository
import com.example.subcomponentlesson8.repository.IBooksRepository
import dagger.Module
import dagger.Provides

@Module
open class BooksRepositoryModule {
    @BooksScope
    @Provides
    fun repository(): IBooksRepository {
        return BooksRepository()
    }
}