package com.birthday.birthday_event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.birthday.birthday_event.exception.ResourceNotFoundException;
import com.birthday.birthday_event.model.LoginModel;
import com.birthday.birthday_event.repository.LoginRepository;
import java.util.*;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping
public class Logincontroller {
  @Autowired
  private LoginRepository loginRepo;

  //creating 
  @PostMapping("/userinfo")
  public LoginModel storeUser(@RequestBody LoginModel login){
      return loginRepo.save(login);
  }
  // get all
  @GetMapping("/userinfo")
  public List<LoginModel> getAllUsers()
  {
    return loginRepo.findAll();
  }

    //retriving the infos by id
  @GetMapping("/userinfo/{id}")
  public ResponseEntity<LoginModel> getuserById(@PathVariable long id) {
    LoginModel user = loginRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not existed for id:"+id));
   return ResponseEntity.ok(user);
   }

   //delete  the user infos
   @DeleteMapping("/userinfo/delete/{id}")
   public ResponseEntity<Map<String,Boolean>> deleteuser(@PathVariable Long id){
 
    LoginModel user = loginRepo.findById(id).
    orElseThrow(() -> new ResourceNotFoundException("user not existed for id:"+id));

    loginRepo.delete(user);
    Map<String,Boolean> response = new HashMap<>();
    response.put("deleted",Boolean.TRUE);
    return ResponseEntity.ok(response);
  }
  //update the infos
  @PutMapping("/updateUser/{id}")
  public ResponseEntity<LoginModel> updateuser(@PathVariable long id,@RequestBody LoginModel userdetails) {
    LoginModel user = loginRepo.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("User not existed for id:"+id));
    user.setEmail(userdetails.getEmail());
    user.setPassword(userdetails.getPassword());
    // user.setName(userdetails.getName());
    LoginModel updateduser = loginRepo.save(user);
    return ResponseEntity.ok(updateduser);
   }

 
}
