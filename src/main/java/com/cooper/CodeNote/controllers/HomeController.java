package com.cooper.CodeNote.controllers;

import com.cooper.CodeNote.data.NoteRepository;
import com.cooper.CodeNote.models.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController extends ActionController {

    @Autowired
    private NoteRepository noteRepository;

    //Navigation
    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("notes", noteRepository.findAll());
        return "index";
    }

    //add
    @RequestMapping(value = "/add")
    public String add(Model model) {
        model.addAttribute("note", new Note());
        return "add";
    }
    @PostMapping("add")
    public String procesPostNoteForm(@ModelAttribute Note note) {
        noteRepository.save(note);
        return "add";
    }

    //Edit
    @RequestMapping(value = "/edit/{id}")
    public String edit(@PathVariable(name = "id") int id) {
        noteRepository.findById(id);
        return "/edit";
    }
    @RequestMapping(value ="/save", method = RequestMethod.POST)
    public String saveNote(@ModelAttribute("note") Note note) {
        noteRepository.save(note);
        return "/edit";
    }

    //Search
    @RequestMapping(value = "/search")
    public String search(Model model) {
        return "search";
    }

    //Categories
    @RequestMapping(value = "/categories/csharp")
    public String csharp(Model model) {
        return "categories/csharp";
    }
    @RequestMapping(value = "/categories/html_css")
    public String html_css(Model model) {
        return "categories/html_css";
    }
    @RequestMapping(value = "/categories/java")
    public String java(Model model) {
        return "categories/java";
    }
    @RequestMapping(value = "/categories/javascript")
    public String javascript(Model model) {
        return "categories/javascript";
    }

}
