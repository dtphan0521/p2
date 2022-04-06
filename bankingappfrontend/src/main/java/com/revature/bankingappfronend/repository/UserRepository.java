package com.revature.bankingappfronend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.bankingappfronend.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByEmail(String email);
    Boolean existsByEmail (String email);

	Optional<User> findByUsername(String username);
	Boolean existsByUsername(String username);
}

