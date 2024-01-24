package com.practice.userservice;

import com.practice.userservice.entities.Rating;
import com.practice.userservice.external.services.RatingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class UserserviceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private RatingService ratingService;

	@Test
	void createRating()
	{
		Rating rating = Rating.builder().rating(10).userId("").hotelId(0).feedback("Best Hotel").build();
		ratingService.createRating(rating);
	}

}
