package com.rabhcode.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rabhcode.persistence.model.NewLocationToken;
import com.rabhcode.persistence.model.UserLocation;

public interface NewLocationTokenRepository extends JpaRepository<NewLocationToken, Long> {

    NewLocationToken findByToken(String token);

    NewLocationToken findByUserLocation(UserLocation userLocation);

}
