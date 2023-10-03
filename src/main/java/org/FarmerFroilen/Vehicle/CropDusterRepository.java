package org.FarmerFroilen.Vehicle;
import org.FarmerFroilen.Vehicle.CropDuster;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CropDusterRepository extends MongoRepository<CropDuster, ObjectId> {
}
