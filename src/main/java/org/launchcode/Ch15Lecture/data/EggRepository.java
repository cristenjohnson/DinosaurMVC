package org.launchcode.Ch15Lecture.data;

import org.launchcode.Ch15Lecture.models.Egg;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface EggRepository extends CrudRepository<Egg, Integer> {

}
