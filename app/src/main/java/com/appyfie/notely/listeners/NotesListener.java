package com.appyfie.notely.listeners;

import android.view.View;

import com.appyfie.notely.entities.Note;

public interface NotesListener {
    void onNoteClicked(View view, Note note, int position);

    void onNoteLongClicked(View view, Note note, int position);
}
