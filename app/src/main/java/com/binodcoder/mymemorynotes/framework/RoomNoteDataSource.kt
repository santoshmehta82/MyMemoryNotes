package com.binodcoder.mymemorynotes.framework

import android.content.Context
import com.binodcoder.core.data.Note
import com.binodcoder.core.repository.NoteDataSource
import com.binodcoder.mymemorynotes.framework.db.DatabaseService
import com.binodcoder.mymemorynotes.framework.db.NoteEntity

class RoomNoteDataSource(context: Context): NoteDataSource {
    val noteDao = DatabaseService.getInstance(
        context
    ).noteDao()

    override suspend fun add(note: Note) = noteDao.addNoteEntity(
        NoteEntity.fromNote(
            note
        )
    )

    override suspend fun get(id: Long) = noteDao.getNoteEntity(id)?.toNote()

    override suspend fun getAll() = noteDao.getAllNoteEntities().map {it.toNote()}

    override suspend fun remove(note: Note) = noteDao.deleteNoteEntity(
        NoteEntity.fromNote(
            note
        )
    )
}