package com.practice.userservice.entities;

import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rating {
    private String ratingId;
    private String userId;
    private Integer hotelId;
    private int rating;
    private String feedback;

    private Hotel hotel;

}

