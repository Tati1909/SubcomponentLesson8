package com.example.subcomponentlesson8.di.modules

import com.example.subcomponentlesson8.annotation.AuthorsScope
import com.example.subcomponentlesson8.repository.AuthorsRepository
import com.example.subcomponentlesson8.repository.IAuthorsRepository
import dagger.Module
import dagger.Provides

/**
 * AuthorsScope наша аннотация, которую мы создали
 */
@Module
open class AuthorsRepositoryModule {

    @AuthorsScope
    @Provides
    fun repository(): IAuthorsRepository {
        return AuthorsRepository()
    }
}
