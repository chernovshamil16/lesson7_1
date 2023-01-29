package com.example.lesson7_1.data.mappers

import com.example.lesson7_1.data.model.NoteEntity
import com.example.lesson7_1.domain.model.Note


fun NoteEntity.toNote() = Note(
    id, title, desc, createdAd
)

fun Note.toNoteEntity() = NoteEntity(
    id, title, desc, createdAd
)