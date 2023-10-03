package org.FarmerFroilen;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HorseRepository extends MongoRepository<Horse, ObjectId> {

}
