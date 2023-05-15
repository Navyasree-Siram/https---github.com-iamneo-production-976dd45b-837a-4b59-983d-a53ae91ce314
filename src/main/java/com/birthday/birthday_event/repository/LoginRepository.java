package com.birthday.birthday_event.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.birthday.birthday_event.model.LoginModel;
public interface LoginRepository extends JpaRepository <LoginModel,Long>{
    
    // User findByname(String name);
}
