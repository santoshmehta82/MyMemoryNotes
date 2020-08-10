package com.binodcoder.mymemorynotes.framework.di

import com.binodcoder.mymemorynotes.framework.ListViewModel
import com.binodcoder.mymemorynotes.framework.NoteViewModel
import dagger.Component

@Component(modules = [ApplicationModule::class, RepositoryModule::class, UseCasesModule::class])
interface ViewModelComponent {
    fun inject(noteViewModel : NoteViewModel)
    fun inject(listViewModel : ListViewModel)
}