package com.shubham.authservice.repositories;

import com.shubham.authservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {}
