package com.codegiam.fullstackbackend.repository;

import com.codegiam.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
