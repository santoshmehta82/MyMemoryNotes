package com.binodcoder.mymemorynotes.framework.di

import android.app.Application
import com.binodcoder.core.repository.NoteRepository
import com.binodcoder.mymemorynotes.framework.RoomNoteDataSource
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {
    @Provides
    fun providesRepository(app: Application) = NoteRepository(RoomNoteDataSource(app))
}