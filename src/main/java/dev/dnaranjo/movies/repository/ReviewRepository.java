package dev.dnaranjo.movies.repository;
import dev.dnaranjo.movies.models.Review;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ReviewRepository extends MongoRepository<Review, ObjectId>{
    
}
