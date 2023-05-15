package com.birthday.birthday_event.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.birthday.birthday_event.model.AddOn;
public interface AddOnRepository extends  JpaRepository <AddOn,Long> {
    
}
