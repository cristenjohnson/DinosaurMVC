package org.launchcode.Ch15Lecture.data;

import org.launchcode.Ch15Lecture.models.Dinosaur;

import java.util.ArrayList;

public class DinoData {
    //this a place to store array list of dinosaurs
    //your mini database
    private static ArrayList<Dinosaur> allDinos = new ArrayList();

    public static ArrayList<Dinosaur> getAllDinos() {

        return allDinos;
    }
    //take in some info to get the type of dino
    //this will go into the dino object
    public static void addDino(Dinosaur newDinoObject) {

        allDinos.add(newDinoObject);
    }
}
