package com.frontbackend.thymeleaf.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DogController {
    @GetMapping("/Dog/")
    public String dogPage(Model model) {
        // Pass any specific data to Crash page
        return "Dog/bark";
    }
}
