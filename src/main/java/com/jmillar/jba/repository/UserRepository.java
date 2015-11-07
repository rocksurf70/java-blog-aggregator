package com.jmillar.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jmillar.jba.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
