package org.FarmerFroilen.Receptacle;

import org.FarmerFroilen.Receptacle.Farm;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FarmRepository extends MongoRepository<Farm, Object> {
}
