package com.flght_reservation_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flght_reservation_1.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
