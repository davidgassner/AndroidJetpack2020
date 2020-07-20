package com.example.plainolnotes4

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.plainolnotes4.data.NoteEntity
import com.example.plainolnotes4.databinding.ListItemBinding

class NotesListAdapter(private val notesList: List<NoteEntity>) :
    RecyclerView.Adapter<NotesListAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val binding = ListItemBinding.bind(itemView)
    }
}