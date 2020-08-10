package com.binodcoder.core.usecase

import com.binodcoder.core.repository.NoteRepository

class GetNote (private  val noteRepository: NoteRepository){
    suspend operator fun invoke(id: Long) = noteRepository.getNote(id)
}