package com.birthday.birthday_event.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.birthday.birthday_event.model.Menu;
public interface MenuRepository extends JpaRepository <Menu,Long>{
    
}
