package com.example.lesson7_1.domain.ккузщышещкн

import com.example.lesson7_1.domain.model.Note

interface NoteRepository {

    fun createNote(note: Note)

    fun editNote(note: Note)

    fun deleteNote(note: Note)

    fun getNote() : List<Note>
}