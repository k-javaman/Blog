package com.frontbackend.thymeleaf.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CatController {
    @GetMapping("/Cat/")
    public String catPage(Model model) {
        // Pass any specific data to HTML page
        return "/Cat/meow";
    }
}
