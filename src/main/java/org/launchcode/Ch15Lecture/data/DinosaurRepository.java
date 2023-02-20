package org.launchcode.Ch15Lecture.data;

import org.launchcode.Ch15Lecture.models.Dinosaur;
import org.springframework.data.repository.CrudeRepository;
import org.springframework.stereotype.Repository;

public interface DinosaurRepository extends CrudeRepository<Dinosaur, Integer>{


//    Object findAll();
//
//    void save(Dinosaur newDinoObject);
}
