package com.birthday.birthday_event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.birthday.birthday_event.exception.ResourceNotFoundException;
import com.birthday.birthday_event.model.User;
import com.birthday.birthday_event.repository.UserRepository;
import java.util.*;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping
public class Usercontroller {
    @Autowired
  private UserRepository userRepo;

  //creating 
  @PostMapping("/customerinfo")
  public User storeCustomer(@RequestBody User user){
      return userRepo.save(user);
  }
  // get all
  @GetMapping("/customerinfo")
  public List<User> getAllUsers()
  {
    return userRepo.findAll();
  }

    //retriving the infos by id
  @GetMapping("/customerinfo/{id}")
  public ResponseEntity<User> getuserById(@PathVariable long id) {
    User user = userRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not existed for id:"+id));
   return ResponseEntity.ok(user);
   }

   //delete  the user infos
   @DeleteMapping("/customerinfo/delete/{id}")
   public ResponseEntity<Map<String,Boolean>> deleteuser(@PathVariable Long id){
 
    User user = userRepo.findById(id).
    orElseThrow(() -> new ResourceNotFoundException("user not existed for id:"+id));

    userRepo.delete(user);
    Map<String,Boolean> response = new HashMap<>();
    response.put("deleted",Boolean.TRUE);
    return ResponseEntity.ok(response);
  }
  //update the infos
  @PutMapping("/updateCustomer/{id}")
  public ResponseEntity<User> updateuser(@PathVariable long id,@RequestBody User userdetails) {
    User user = userRepo.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("User not existed for id:"+id));
    user.setEmail(userdetails.getEmail());
    user.setPassword(userdetails.getPassword());
    // user.setName(userdetails.getName());
    User updateduser = userRepo.save(user);
    return ResponseEntity.ok(updateduser);
   }

}
