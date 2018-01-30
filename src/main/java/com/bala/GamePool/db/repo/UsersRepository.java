package com.bala.GamePool.db.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bala.GamePool.db.entity.User;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UsersRepository extends MongoRepository<User, Long>{
	
	User findByEmail(String email);

}
