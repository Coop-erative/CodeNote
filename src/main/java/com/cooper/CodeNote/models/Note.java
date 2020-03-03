package com.cooper.CodeNote.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;


@Entity
public class Note {
    @Id
    @GeneratedValue
    private int id;

    private String description;

    private String text;

    public Note(String description, String text) {
        this.description = description;
        this.text = text;
    }

    public Note() {}

    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
