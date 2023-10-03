package org.FarmerFroilen.Animal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorseService {

    @Autowired

    private HorseRepository horseRepository;

    @Autowired

    private MongoTemplate mongoTemplate;

    public List<Horse> allHorsies(){
        return horseRepository.findAll();
    }

    public Horse createHorsie(){
        Horse horse = horseRepository.insert(new Horse());

        return horse;
    }
}
