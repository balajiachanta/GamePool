package com.bala.GamePool.db.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bala.GamePool.db.entity.UserPrediction;

@RepositoryRestResource(collectionResourceRel = "userpredictions", path = "userpredections")
public interface UsersPredictionsRepository extends MongoRepository<UserPrediction, Long>{
	
	UserPrediction findByUserid(long userid);

}
