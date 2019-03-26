package com.noteapp.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Note implements Serializable{

    private static final long serialVersionUID = 0x62A6DA99AABDA8A8L;
	
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer noteId;
    @Column
    private String noteDescription;

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


    public Note() {
    }

    public Note(String noteDescription) {
        this.noteDescription = noteDescription;

    }
}
