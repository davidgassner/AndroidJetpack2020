package com.example.plainolnotes4.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNote(note: NoteEntity)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertNotes(notes: List<NoteEntity>)

    @Delete
    fun deleteNote(note: NoteEntity)

    @Delete
    fun deleteNotes(notes: List<NoteEntity>)

    @Query("SELECT * FROM notes WHERE id = :id")
    fun getNoteById(id: Int)

    @Query("SELECT * FROM notes ORDER BY date ASC")
    fun getAll(): LiveData<List<NoteEntity>>

    @Query("DELETE FROM notes")
    fun deleteAll(): Int

    @Query("SELECT COUNT(*) FROM notes")
    fun getCount(): Int

}