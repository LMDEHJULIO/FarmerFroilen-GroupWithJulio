package org.FarmerFroilen.Person;

import org.FarmerFroilen.Person.Pilot;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PilotRepository extends MongoRepository<Pilot, ObjectId> {
}
