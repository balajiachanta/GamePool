package com.bala.GamePool.db.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bala.GamePool.db.entity.MatchDetail;

@RepositoryRestResource(collectionResourceRel = "matchdetails", path = "matchdetails")
public interface MatchDetailsRepository extends MongoRepository<MatchDetail, Long>{
	


}
