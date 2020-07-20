package com.example.plainolnotes4.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.plainolnotes4.NEW_NOTE_ID
import java.util.*

@Entity(tableName = "notes")
data class NoteEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var date: Date,
    var text: String
) {
    constructor() : this(NEW_NOTE_ID, Date(), "")
    constructor(date: Date, text: String) : this(NEW_NOTE_ID, date, text)
}
