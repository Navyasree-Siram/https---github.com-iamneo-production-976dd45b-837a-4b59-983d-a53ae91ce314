package com.birthday.birthday_event.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.birthday.birthday_event.model.Admin;
public interface AdminRepository extends  JpaRepository <Admin,Long> {
    
}
