package com.rabhcode.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rabhcode.persistence.model.User;
import com.rabhcode.persistence.model.UserLocation;

public interface UserLocationRepository extends JpaRepository<UserLocation, Long> {
    UserLocation findByCountryAndUser(String country, User user);

}
