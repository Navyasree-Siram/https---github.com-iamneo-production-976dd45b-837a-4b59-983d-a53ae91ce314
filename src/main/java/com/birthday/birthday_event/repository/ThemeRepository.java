package com.birthday.birthday_event.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.birthday.birthday_event.model.Theme;
public interface ThemeRepository extends  JpaRepository <Theme,Long> {
    
}
