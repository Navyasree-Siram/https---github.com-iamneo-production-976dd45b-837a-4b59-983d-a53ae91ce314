package com.birthday.birthday_event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.birthday.birthday_event.exception.ResourceNotFoundException;
import com.birthday.birthday_event.model.AddOn;
import com.birthday.birthday_event.repository.AddOnRepository;
import java.util.*;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping
public class AddOncontroller {
    @Autowired
  private AddOnRepository addOnRepo;

  //creating 
  @PostMapping("/addoninfo")
  public AddOn storeAddon(@RequestBody AddOn addOn){
      return addOnRepo.save(addOn);
  }
  // get all
  @GetMapping("/addoninfo")
  public List<AddOn> getAllAddons()
  {
    return addOnRepo.findAll();
  }

  @GetMapping("/addoninfo/{id}")
  public ResponseEntity<AddOn> getuserById(@PathVariable long id) {
    AddOn addon = addOnRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not existed for id:"+id));
   return ResponseEntity.ok(addon);
   }

   //delete  the user infos
   @DeleteMapping("/addoninfo/delete/{id}")
   public ResponseEntity<Map<String,Boolean>> deleteaddon(@PathVariable Long id){
 
    AddOn addOn = addOnRepo.findById(id).
    orElseThrow(() -> new ResourceNotFoundException("addon not existed for id:"+id));

    addOnRepo.delete(addOn);
    Map<String,Boolean> response = new HashMap<>();
    response.put("deleted",Boolean.TRUE);
    return ResponseEntity.ok(response);
  }
  //update the infos
  @PutMapping("/updateAddon/{id}")
  public ResponseEntity<AddOn> updateaddon(@PathVariable long id,@RequestBody AddOn addondetails) {
    AddOn addon = addOnRepo.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("User not existed for id:"+id));
    addon.setEmail(addondetails.getEmail());
    addon.setPassword(addondetails.getPassword());
    // user.setName(userdetails.getName());
    AddOn updatedaddOn = addOnRepo.save(addon);
    return ResponseEntity.ok(updatedaddOn);
   }

}
