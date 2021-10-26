package com.flght_reservation_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flght_reservation_1.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
