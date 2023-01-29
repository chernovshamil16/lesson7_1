package com.example.lesson7_1.domain.usecases

import com.example.lesson7_1.domain.model.Note
import com.example.lesson7_1.domain.ккузщышещкн.NoteRepository

class EditNotesUseCase(private val noteRepository: NoteRepository) {

    fun editNotes(note: Note) = noteRepository.editNote(note)
}