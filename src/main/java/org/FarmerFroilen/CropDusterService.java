package org.FarmerFroilen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CropDusterService {
    @Autowired

    private CropDusterRepository cropDusterRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<CropDuster> allDusters(){return cropDusterRepository.findAll();}

//    public Farmer createFarmer(String name){
//        Farmer farmer = farmerRepository.insert(new Farmer(name));
//
//        return farmer;
//    }

    public CropDuster createDuster(String name, String noise, String isRideable){
        CropDuster duster = cropDusterRepository.insert(new CropDuster(name, noise, true));

        return duster;
    }
}
