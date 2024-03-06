package com.practice.ratingservice.controllers;

import com.okta.spring.boot.oauth.AuthoritiesProvider;
import com.practice.ratingservice.constants.Authorities;
import com.practice.ratingservice.entities.Rating;
import com.practice.ratingservice.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.security.authorization.AuthorityReactiveAuthorizationManager.hasAuthority;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @PreAuthorize("hasAuthority('admin')")
    @PostMapping
    public ResponseEntity<Rating> create(@RequestBody Rating rating)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
    }

    @PreAuthorize("hasAuthority('admin') || hasAuthority('SCOPE_internal')")
    @GetMapping
    public ResponseEntity<List<Rating>> getRatings()
    {
      return  ResponseEntity.ok(ratingService.getRatings());
    }

    @PreAuthorize("hasAuthority('admin') || hasAuthority('SCOPE_internal')")
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable String userId)
    {
        return  ResponseEntity.ok(ratingService.getRatingsByUserId(userId));
    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingsByHotelId(@PathVariable Integer hotelId)
    {
        return  ResponseEntity.ok(ratingService.getRatingsByHotelId(hotelId));
    }

}
