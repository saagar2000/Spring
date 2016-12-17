package com.mongodb.spring_mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
interface IDocumentFileRepository extends MongoRepository<DocumentFile, String> {
}
