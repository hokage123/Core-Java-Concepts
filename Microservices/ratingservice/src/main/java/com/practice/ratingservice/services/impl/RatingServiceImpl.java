package com.practice.ratingservice.services.impl;

import com.practice.ratingservice.entities.Rating;
import com.practice.ratingservice.repository.RatingRepository;
import com.practice.ratingservice.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository repository;

    @Override
    public Rating create(Rating rating) {
        return repository.save(rating);
    }

    @Override
    public List<Rating> getRatings() {
        return repository.findAll();
    }

    @Override
    public List<Rating> getRatingsByUserId(String userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingsByHotelId(Integer hotelId) {
        return repository.findByHotelId(hotelId);
    }
}
