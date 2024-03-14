package com.practice.ratingservice.repository;

import com.practice.ratingservice.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface RatingRepository extends MongoRepository<Rating, String> {

    //customfinder methods

    List<Rating> findByUserId(String userId);
    List<Rating> findByHotelId(Integer hotelId);
}
