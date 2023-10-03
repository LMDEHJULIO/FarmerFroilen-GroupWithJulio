package org.FarmerFroilen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmService {
    @Autowired

    private FarmRepository farmRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Farm> allFarms(){return farmRepository.findAll();}

//    public Farmer createFarmer(String name){
//        Farmer farmer = farmerRepository.insert(new Farmer(name));
//
//        return farmer;
//    }

    public Farm createFarm(){
        Farm farm = farmRepository.insert(new Farm());

        return farm;
    }
}
