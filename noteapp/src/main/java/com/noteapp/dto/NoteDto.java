package com.noteapp.dto;

public class NoteDto {
    Integer noteId;
    String noteDescription;

    public NoteDto(Integer noteId, String noteDescription) {
        this.noteId = noteId;
        this.noteDescription = noteDescription;
    }

    public NoteDto() {
    }

    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public String getNoteDescription() {
        return noteDescription;
    }

    public void setNoteDescription(String noteDescription) {
        this.noteDescription = noteDescription;
    }

}
