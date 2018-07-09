package com.spring5.nut.controller;

import com.spring5.nut.repository.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Controller
public class AuthorController {
    private AuthorRepository authorRepository;

    @GetMapping("/authors")
    public String getAuthor(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        return "authors";
    }
}
