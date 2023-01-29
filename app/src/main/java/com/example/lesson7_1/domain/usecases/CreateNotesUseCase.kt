package com.example.lesson7_1.domain.usecases

import com.example.lesson7_1.domain.model.Note
import com.example.lesson7_1.domain.ккузщышещкн.NoteRepository

class CreateNotesUseCase(private val noteRepository: NoteRepository) {

    fun createNotes(note: Note) = noteRepository.createNote(note)
}