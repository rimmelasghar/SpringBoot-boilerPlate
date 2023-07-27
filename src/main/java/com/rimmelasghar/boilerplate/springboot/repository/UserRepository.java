package com.rimmelasghar.boilerplate.springboot.repository;

import com.rimmelasghar.boilerplate.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// rimmel asghar
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

	boolean existsByEmail(String email);

	boolean existsByUsername(String username);

}
