package com.example.lesson22.controller;

import com.example.lesson22.model.Cat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HTMLController {

    @GetMapping("/welcome")
    public String welcomePage(Model model, @RequestParam(name = "name") String name) {
        Cat cat = new Cat("Мурзик", 5, "Рыжий");

        String[] names = {"Мурзик", "Масик"};

        model.addAttribute("names", names);
        return "main";
    }
}
