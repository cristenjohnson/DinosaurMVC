package org.launchcode.Ch15Lecture.controllers;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.launchcode.Ch15Lecture.data.DinoData;
import org.launchcode.Ch15Lecture.data.DinosaurRepository;
import org.launchcode.Ch15Lecture.models.Dinosaur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
@RequestMapping("dino")
public class DinoController {
    @Autowired
    private DinosaurRepository dinosaurRepository;


    @GetMapping
    public String dino(Model model) {
        //pass a list of the dinos into DinoData
        model.addAttribute("allDinos", dinosaurRepository.findAll());
        return "dino/index";
    }

    @GetMapping("add")
    public String addDinoForm(Model model) {
        model.addAttribute("dinosaur", new Dinosaur());
        return "dino/add";
    }

    @PostMapping("add")
    public String processAddDinoForm(Model model, @ModelAttribute @Valid Dinosaur newDinoObject,
                                     Errors errors) {
        //now you have to create a dinosaur object to hold all the dinosaurs
        // Dinosaur newDinoObject = new Dinosaur(species, diet, aquatic);
//this is where the dino will be expressed

        if (errors.hasErrors()) {
            model.addAttribute("errorMsg", "The species must have at least 3 characters");
            return "dino/add";
        }
        dinosaurRepository.save(newDinoObject);
        //DinoData.addDino(newDinoObject);
        // model.addAttribute("allDinos", DinoData.getAllDinos());
        return "redirect:";
    }
}
