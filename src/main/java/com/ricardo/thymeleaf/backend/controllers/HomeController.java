package com.ricardo.thymeleaf.backend.controllers;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(@RequestParam(name = "showDetails", required = false) boolean showDetails,
            Model model) {
        model.addAttribute("skills", Arrays.asList(
                "PHP",
                "Java",
                "Python"));

        model.addAttribute("showDetails", showDetails);

        return "index";
    }
}
