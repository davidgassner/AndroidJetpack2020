package com.example.plainolnotes4

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.plainolnotes4.data.AppDatabase
import com.example.plainolnotes4.data.NoteEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class EditorViewModel(app: Application) : AndroidViewModel(app) {

    private val database = AppDatabase.getInstance(app)
    val currentNote = MutableLiveData<NoteEntity>()

    fun getNoteById(noteId: Int) {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                val note =
                    if (noteId != NEW_NOTE_ID) {
                        database?.noteDao()?.getNoteById(noteId)
                    } else {
                        NoteEntity()
                    }
                currentNote.postValue(note)
            }
        }
    }

    fun updateNote() {
        currentNote.value?.let {
            it.text = it.text.trim()
            if (it.id == NEW_NOTE_ID && it.text.isEmpty()) {
                return
            }

            viewModelScope.launch {
                withContext(Dispatchers.IO) {
                    if (it.text.isEmpty()) {
                        database?.noteDao()?.deleteNote(it)
                    } else {
                        database?.noteDao()?.insertNote(it)
                    }
                }
            }

        }


    }

}