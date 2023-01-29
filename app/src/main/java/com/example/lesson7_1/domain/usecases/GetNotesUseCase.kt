package com.example.lesson7_1.domain.usecases

import com.example.lesson7_1.domain.ккузщышещкн.NoteRepository


class GetNotesUseCase(private val noteRepository: NoteRepository) {

    fun getNotes() = noteRepository.getNote()
}