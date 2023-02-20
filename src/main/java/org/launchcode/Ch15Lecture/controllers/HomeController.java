package org.launchcode.Ch15Lecture.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    //use a method to render the home.html view on localhost
    @GetMapping
    public String home() {

        return "home";
    }
}
