package com.sathish.notesapp;

import androidx.cardview.widget.CardView;

import com.sathish.notesapp.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
