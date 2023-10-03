package org.FarmerFroilen.Animal;

import org.FarmerFroilen.Animal.Chicken;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ChickenRepository extends MongoRepository<Chicken, ObjectId> {

}
