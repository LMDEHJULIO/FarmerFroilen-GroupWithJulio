package org.FarmerFroilen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PilotService {
    @Autowired

    private PilotRepository pilotRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Pilot> allPilots(){return pilotRepository.findAll();}

//    public Farmer createFarmer(String name){
//        Farmer farmer = farmerRepository.insert(new Farmer(name));
//
//        return farmer;
//    }

    public Pilot createPilot(String name){
        Pilot pilot = pilotRepository.insert(new Pilot(name));

        return pilot;
    }
}
