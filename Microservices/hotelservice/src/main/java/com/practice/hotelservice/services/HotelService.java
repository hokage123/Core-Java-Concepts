package com.practice.hotelservice.services;

import com.practice.hotelservice.entities.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

public interface HotelService {

    Hotel create(Hotel hotel);

    List<Hotel> getAll();

    Hotel get(Integer id);
}
