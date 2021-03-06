package com.binodcoder.core.usecase

import com.binodcoder.core.data.Note
import com.binodcoder.core.repository.NoteRepository

class AddNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.addNote(note)
}