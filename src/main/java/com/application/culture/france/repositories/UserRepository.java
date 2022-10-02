package com.application.culture.france.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.culture.france.models.User;



public interface UserRepository extends JpaRepository<User, Integer> {

}
