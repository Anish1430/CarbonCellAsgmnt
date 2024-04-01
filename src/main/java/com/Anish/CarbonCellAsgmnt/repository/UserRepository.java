package com.Anish.CarbonCellAsgmnt.repository;


import com.Anish.CarbonCellAsgmnt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
