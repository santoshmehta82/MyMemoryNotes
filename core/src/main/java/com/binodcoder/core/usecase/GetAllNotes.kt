package com.binodcoder.core.usecase

import com.binodcoder.core.repository.NoteRepository

class GetAllNotes (private val noteRepository: NoteRepository) {
    suspend operator fun invoke() = noteRepository.getAllNotes()
}