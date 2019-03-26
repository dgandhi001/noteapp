package com.noteapp.service.impl;

import com.noteapp.converter.NoteConverter;
import com.noteapp.dto.NoteDto;
import com.noteapp.repository.NoteRepository;
import com.noteapp.service.NoteService;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteServiceimpl implements NoteService {
	@Autowired
	NoteRepository noteRepository;

	@Override
	public NoteDto getNoteById(Integer noteId) {
		return NoteConverter.entityToDto(noteRepository.getOne(noteId));
	}

	@Override
	public void saveNote(NoteDto noteDto) {
		noteRepository.save(NoteConverter.dtoToEntity(noteDto));
	}

	@Override
	public void updateNote(NoteDto noteDto) {
		noteRepository.save(NoteConverter.dtoToEntity(noteDto));
	}

	@Override
	public List<NoteDto> getAllNotes() {
		return noteRepository.findAll().stream().map(NoteConverter::entityToDto).collect(Collectors.toList());
	}
}
