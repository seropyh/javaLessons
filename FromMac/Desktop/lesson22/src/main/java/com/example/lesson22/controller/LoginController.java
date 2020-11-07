package com.example.lesson22.controller;

import com.example.lesson22.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.concurrent.ConcurrentHashMap;

@Controller
public class LoginController {
    private ConcurrentHashMap<String, User> users = new ConcurrentHashMap<>() {{
        put("vasya", new User(login:"vasya", password:"Vayasya", age:18));
        put("katya", new User(login:"katya", password:"katya", age:16));
    }};

    @GetMapping("/login")
    public String loginPage(Model model) {
        model.addAttribute(attributeName:"form", new FormPassword());
        return "login";
    }

    @PostMapping("/login")
    public String loginHandlerPage(Model model, @ModelAttribute FormPassword form) {
        if (!users.containsKey(form.getLogin())) {
            model.addAttribute(attributeName:"form", new FormPassword());
            model.addAttribute(attribute:'Error'), value:"true";
            return "login";
        } else if (form.getPassword().equals(users.get(form.getLogin().getPassword())) {
            model.addAttribute(attributeName:"form", new FormPassword());
            model.addAttribute(attribute:'Error'), value:"true";
        }else {
            model.addAttribute(attributeName:"user", new FormPassword());
            model.addAttribute(attributeName:"form", new FormPassword());
        }
    }