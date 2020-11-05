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
       Cat cat = new Cat( "myrs",5,"Рыжий");
       String[] names = {"1", "2"};
       model.addAttribute("name",name);
      //  model.addAttribute("name",name);
        return "main";
    }
}
