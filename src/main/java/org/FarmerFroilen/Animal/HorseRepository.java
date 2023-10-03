package org.FarmerFroilen.Animal;

import org.FarmerFroilen.Animal.Horse;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HorseRepository extends MongoRepository<Horse, ObjectId> {

}
