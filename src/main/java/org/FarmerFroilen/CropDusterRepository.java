package org.FarmerFroilen;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CropDusterRepository extends MongoRepository<CropDuster, ObjectId> {
}
