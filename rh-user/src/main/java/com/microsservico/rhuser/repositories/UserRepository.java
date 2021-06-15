package com.microsservico.rhuser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microsservico.rhuser.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

	User findByEmail(String email);
}
