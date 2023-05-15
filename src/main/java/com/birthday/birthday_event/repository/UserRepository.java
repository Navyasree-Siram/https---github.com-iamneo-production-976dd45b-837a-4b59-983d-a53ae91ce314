package com.birthday.birthday_event.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.birthday.birthday_event.model.User;

public interface UserRepository extends  JpaRepository <User,Long>{

 
    // User findByname(String name);
}