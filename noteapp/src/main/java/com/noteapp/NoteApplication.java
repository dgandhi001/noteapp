package com.noteapp;

import com.noteapp.entity.Note;
import com.noteapp.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class NoteApplication {
	@Autowired
    NoteRepository noteRepository;

	public static void main(String[] args) {
		SpringApplication.run(NoteApplication.class, args);
	}

	@PostConstruct
	public void setupDbWithData(){
		Note note= new Note("Deepika Gandhi");
		note= noteRepository.save(note);
	}
}
