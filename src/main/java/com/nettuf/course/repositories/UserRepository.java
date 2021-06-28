package com.nettuf.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nettuf.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
