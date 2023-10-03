package org.FarmerFroilen.Animal;


import org.FarmerFroilen.Animal.Chicken;
import org.FarmerFroilen.Animal.ChickenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChickenService {

    @Autowired

    private ChickenRepository chickenRepository;

    @Autowired

    private MongoTemplate mongoTemplate;

    public List<Chicken> allChickens(){
        return chickenRepository.findAll();
    }

    public Chicken createChicken(){
        Chicken chicken = chickenRepository.insert(new Chicken());

        return chicken;
    }
}
