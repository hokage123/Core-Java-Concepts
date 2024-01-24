package com.practice.userservice.services.impl;

import com.practice.userservice.entities.Hotel;
import com.practice.userservice.entities.Rating;
import com.practice.userservice.entities.User;
import com.practice.userservice.exception.ResourceNotFoundException;
import com.practice.userservice.external.services.HotelService;
import com.practice.userservice.repositories.UserRepository;
import com.practice.userservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.List;
import java.util.Arrays;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HotelService hotelService;

    @Override
    public User saveUser(User user) {
        String randomUUID = UUID.randomUUID().toString();
        user.setUserId(randomUUID);
        userRepository.save(user);
        return user;
    }

    @Override
    public List<User> getAllUser() {
        List<User> allusers = userRepository.findAll();
        for (User user : allusers) {
            String currentUserId = user.getUserId();
            String urlForOtherService = "http://RATING-SERVICE/ratings/users/" + currentUserId;
            List<Rating> ratings = Arrays.stream(restTemplate.getForObject(urlForOtherService, Rating[].class)).toList();

            List<Rating> ratingList = ratings.stream().map(
                    rating -> {
                        /*ResponseEntity<Hotel> forEntity = restTemplate.getForEntity("http://HOTEL-SERVICE/hotels/"
                                                                                +rating.getHotelId(), Hotel.class);
                            Hotel hotel = forEntity.getBody();*/
                        Hotel hotel = hotelService.getHotel(rating.getHotelId());
                        rating.setHotel(hotel);
                        return rating;
                    }
            ).collect(Collectors.toList());
            user.setRatings(ratingList);

        }
        return allusers;
    }

    @Override
    public User getUser(String userId) {
        User user = userRepository.findById(userId).
                orElseThrow(() -> new ResourceNotFoundException("Id does not exists"));
        //http://localhost:8083/ratings/users/{userId}
        String urlForOtherService = "http://RATING-SERVICE/ratings/users/" + userId;
        List<Rating> ratings = Arrays.stream(restTemplate.getForObject(urlForOtherService, Rating[].class)).toList();

        List<Rating> ratingList = ratings.stream().map(
                rating -> {
                    /*ResponseEntity<Hotel> forEntity = restTemplate.getForEntity("http://HOTEL-SERVICE/hotels/"
                                                                                +rating.getHotelId(), Hotel.class);
                    Hotel hotel = forEntity.getBody();*/
                    Hotel hotel = hotelService.getHotel(rating.getHotelId());
                    rating.setHotel(hotel);
                    return rating;
                }
        ).collect(Collectors.toList());
        user.setRatings(ratingList);
        return user;
    }
}
