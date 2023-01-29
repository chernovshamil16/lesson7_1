package com.example.lesson7_1.domain.usecases

import com.example.lesson7_1.domain.model.Note
import com.example.lesson7_1.domain.ккузщышещкн.NoteRepository

class DeleteNotesUseCase(private val noteRepository: NoteRepository) {

    fun deleteNotes(note: Note) = noteRepository.deleteNote(note)
}