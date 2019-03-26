package com.noteapp.service;

import java.util.List;

import com.noteapp.dto.NoteDto;


public interface NoteService {
    NoteDto getNoteById(Integer noteId);
    void saveNote(NoteDto noteDto);
    void updateNote(NoteDto noteDto);
    List<NoteDto> getAllNotes();
}
