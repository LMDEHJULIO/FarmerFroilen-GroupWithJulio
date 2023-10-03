package org.FarmerFroilen;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FarmRepository extends MongoRepository<Farm, Object> {
}
