package com.noteapp.converter;

import com.noteapp.dto.NoteDto;
import com.noteapp.entity.Note;

public class NoteConverter {
	public static Note dtoToEntity(NoteDto noteDto) {
		Note note = new Note(noteDto.getNoteDescription());
		note.setNoteId(noteDto.getNoteId());
		return note;
	}

	public static NoteDto entityToDto(Note note) {
		NoteDto noteDto = new NoteDto(note.getNoteId(), note.getNoteDescription());
		return noteDto;
	}
}
