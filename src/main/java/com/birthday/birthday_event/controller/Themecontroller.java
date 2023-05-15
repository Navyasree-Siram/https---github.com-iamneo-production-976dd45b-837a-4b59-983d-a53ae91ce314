package com.birthday.birthday_event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.birthday.birthday_event.exception.ResourceNotFoundException;
import com.birthday.birthday_event.model.Theme;
import com.birthday.birthday_event.repository.ThemeRepository;
import java.util.*;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping
public class Themecontroller {
    @Autowired
  private ThemeRepository themeRepo;

  //creating 
  @PostMapping("/themeinfo")
  public Theme storeTheme(@RequestBody Theme theme){
      return themeRepo.save(theme);
  }
  // get all
  @GetMapping("/themeinfo")
  public List<Theme> getAllThemes()
  {
    return themeRepo.findAll();
  }

    //retriving the infos by id
  @GetMapping("/themeinfo/{id}")
  public ResponseEntity<Theme> getuserById(@PathVariable long id) {
    Theme theme = themeRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Theme not existed for id:"+id));
   return ResponseEntity.ok(theme);
   }

   //delete  the user infos
   @DeleteMapping("/themeinfo/delete/{id}")
   public ResponseEntity<Map<String,Boolean>> deletetheme(@PathVariable Long id){
 
    Theme theme = themeRepo.findById(id).
    orElseThrow(() -> new ResourceNotFoundException("theme not existed for id:"+id));

    themeRepo.delete(theme);
    Map<String,Boolean> response = new HashMap<>();
    response.put("deleted",Boolean.TRUE);
    return ResponseEntity.ok(response);
  }
  //update the infos
  @PutMapping("/updateTheme/{id}")
  public ResponseEntity<Theme> updatetheme(@PathVariable long id,@RequestBody Theme themedetails) {
    Theme theme = themeRepo.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("User not existed for id:"+id));
    theme.setEmail(themedetails.getEmail());
    theme.setPassword(themedetails.getPassword());
    // user.setName(userdetails.getName());
    Theme updatedtheme = themeRepo.save(theme);
    return ResponseEntity.ok(updatedtheme);
   }

}
