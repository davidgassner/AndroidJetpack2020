package com.example.plainolnotes4.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNote(note: NoteEntity)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertAll(notes: List<NoteEntity>)

    @Query("SELECT * FROM notes ORDER BY date ASC")
    fun getAll(): LiveData<List<NoteEntity>>

    @Query("SELECT * FROM notes WHERE id = :id")
    fun getNoteById(id: Int): NoteEntity?

    @Query("SELECT COUNT(*) from notes")
    fun getCount(): Int

    @Delete
    fun deleteNotes(selectedNotes: List<NoteEntity>): Int

    @Query("DELETE FROM notes")
    fun deleteAll():Int

    @Delete
    fun deleteNote(note: NoteEntity)

}