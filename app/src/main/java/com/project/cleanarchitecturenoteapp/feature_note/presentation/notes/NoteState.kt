package com.project.cleanarchitecturenoteapp.feature_note.presentation.notes

import android.provider.ContactsContract.CommonDataKinds.Note
import com.project.cleanarchitecturenoteapp.feature_note.domain.util.NoteOrder
import com.project.cleanarchitecturenoteapp.feature_note.domain.util.OrderType

data class NoteState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
