package com.cooper.CodeNote.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

public class ActionController {
    static HashMap<String,String> actionChoices = new HashMap<>();

    @ModelAttribute("actions")
    public static String getActionChoices() {
        return "actions";
    }
}
