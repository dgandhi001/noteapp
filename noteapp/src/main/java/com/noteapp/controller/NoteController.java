package com.noteapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.noteapp.dto.NoteDto;
import com.noteapp.service.NoteService;
import com.noteapp.utils.Constants;

@RequestMapping("/note")
@RestController
public class NoteController {
	@Autowired
    NoteService noteService;

	@RequestMapping(value = Constants.GET_NOTE_BY_ID, method = RequestMethod.GET, headers = "Accept=application/json")
	public NoteDto getNoteById(@PathVariable Integer noteId) {
		NoteDto note = noteService.getNoteById(noteId);
		return note;
	}
	
	@RequestMapping(value = Constants.GET_ALL_NOTES, method = RequestMethod.GET, headers = "Accept=application/json")
	public List<NoteDto> getAllNotes() {
		return noteService.getAllNotes();
	}
	
	@RequestMapping(value= Constants.SAVE_NOTE, method = RequestMethod.POST, headers = "Accept=application/json")
	public void saveNote(@RequestBody NoteDto noteDto) {
		noteService.saveNote(noteDto);
	}

	@RequestMapping(value= Constants.SAVE_NOTE, method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateNote(@RequestBody NoteDto noteDto) {
		noteService.updateNote(noteDto);
	}

	@RequestMapping(value = Constants.VIEW_NOTE_BY_ID)
	public ModelAndView viewNoteById(
			RedirectAttributes attributes, @PathVariable Integer noteId, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("/view");
		mav.addObject("noteId", noteId);
		return mav;
	}
}
