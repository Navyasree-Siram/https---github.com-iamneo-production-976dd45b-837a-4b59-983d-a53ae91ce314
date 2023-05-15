package com.birthday.birthday_event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.birthday.birthday_event.exception.ResourceNotFoundException;
import com.birthday.birthday_event.model.Menu;
import com.birthday.birthday_event.repository.MenuRepository;
import java.util.*;

@RestController
// @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping

public class Menucontroller {
    @Autowired
    private MenuRepository MenuRepo;

    @PostMapping("/Menuinfo")
    public Menu storeMenu(@RequestBody Menu newMenu){
        return MenuRepo.save(newMenu);
    }
    @GetMapping("/menuinfo")
  public List<Menu> getAllMenus()
  {
   return MenuRepo.findAll();
  }

  @DeleteMapping("/deletemenu/{id}")
     @ResponseBody
     public String deletemenu(@PathVariable Long id){
	     Menu menu = MenuRepo.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException("Menu not exist with id :" + id));
	
	    MenuRepo.delete(menu);
	    return "\"Menu Deleted\"";
}
@PutMapping("/updateMenu/{id}")
public ResponseEntity<Menu> updatemenu(@PathVariable long id,@RequestBody Menu menudetails) {
  Menu menu = MenuRepo.findById(id).
              orElseThrow(() -> new ResourceNotFoundException("Menu not existed for id:"+id));
  menu.setEmail(menudetails.getEmail());
  menu.setPassword(menudetails.getPassword());
  // user.setName(userdetails.getName());
  Menu updatedmenu = MenuRepo.save(menu);
  return ResponseEntity.ok(updatedmenu);
 }
}
