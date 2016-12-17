package com.mongodb.spring_mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
interface IUserRepository extends MongoRepository<User, String>{

}
