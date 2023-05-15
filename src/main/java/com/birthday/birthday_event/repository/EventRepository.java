package com.birthday.birthday_event.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.birthday.birthday_event.model.Event;
public interface EventRepository extends  JpaRepository <Event,Long>{
    
}
