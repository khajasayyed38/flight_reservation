package com.flght_reservation_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flght_reservation_1.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String emailid);

}
