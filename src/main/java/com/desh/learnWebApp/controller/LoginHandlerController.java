package com.desh.learnWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// defining it's a controller // rescontroller returns the data if it is normal
// Controller it will send the name of the file
@RestController
public class LoginHandlerController {

    @RequestMapping("/login")
    public String login() {
        return "loging page";
    }
}
