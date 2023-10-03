package org.FarmerFroilen;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FarmerService {
    @Autowired

    private FarmerRepository farmerRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Farmer> allFarmers(){return farmerRepository.findAll();}

//    public Farmer createFarmer(String name){
//        Farmer farmer = farmerRepository.insert(new Farmer(name));
//
//        return farmer;
//    }

    public Farmer createFarmer(String name){
        Farmer farmer = farmerRepository.insert(new Farmer(name));

        return farmer;
    }
}
