package com.flght_reservation_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flght_reservation_1.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
