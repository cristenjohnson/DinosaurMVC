package org.launchcode.Ch15Lecture.controllers;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.launchcode.Ch15Lecture.data.DinoData;
import org.launchcode.Ch15Lecture.models.Dinosaur;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("dino")
public class DinoController {
    @GetMapping
    public String dino(Model model) {
        //pass a list of the dinos into DinoData
        model.addAttribute("allDinos", DinoData.getAllDinos());
        return "dino/index";
    }
}
