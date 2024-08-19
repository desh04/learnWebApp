package com.desh.learnWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return "Welcome to 2nd take of this lesson";
    }

    @RequestMapping("/about")
    public String about() {
        return "About";
    }

}
