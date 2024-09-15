package com.example.demo4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/text")
    public String HomeText(Model model){
        System.out.println("Hello HONG PHUC");
        String name = "<h1 style= 'color: pink'> Hello Hong Phuc </h1>";
        model.addAttribute("namehtml", name);
        return "index";// tra ve file index.html ngay ../templates/index.html
    }
}
