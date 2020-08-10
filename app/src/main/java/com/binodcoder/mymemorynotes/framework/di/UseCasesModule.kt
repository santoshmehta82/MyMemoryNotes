package com.binodcoder.mymemorynotes.framework.di

import com.binodcoder.core.repository.NoteRepository
import com.binodcoder.core.usecase.*
import com.binodcoder.mymemorynotes.framework.UseCases
import dagger.Module
import dagger.Provides

@Module
class UseCasesModule {

    @Provides
    fun getUseCases(repository: NoteRepository) = UseCases(
        AddNote(repository),
        GetAllNotes(repository),
        GetNote(repository),
        RemoveNote(repository),
            GetWordCount()
    )
}