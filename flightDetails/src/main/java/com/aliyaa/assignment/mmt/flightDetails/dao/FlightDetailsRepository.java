package com.aliyaa.assignment.mmt.flightDetails.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.aliyaa.assignment.mmt.flightDetails.entity.FlightDetailsCreate;

public interface FlightDetailsRepository extends JpaRepository<FlightDetailsCreate, Integer> {

}
