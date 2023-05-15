package com.birthday.birthday_event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.birthday.birthday_event.exception.ResourceNotFoundException;
import com.birthday.birthday_event.model.Event;
import com.birthday.birthday_event.repository.EventRepository;
import java.util.*;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping
public class Eventcontroller {
    @Autowired
  private EventRepository eventRepo;

  //creating 
  @PostMapping("/eventinfo")
  public Event storeEvent(@RequestBody Event event){
      return eventRepo.save(event);
  }
  // get all
  @GetMapping("/eventinfo")
  public List<Event> getAllEvents()
  {
    return eventRepo.findAll();
  }

    //retriving the infos by id
  @GetMapping("/eventinfo/{id}")
  public ResponseEntity<Event> geteventById(@PathVariable long id) {
    Event event = eventRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("event not existed for id:"+id));
   return ResponseEntity.ok(event);
   }

   //delete  the user infos
   @DeleteMapping("/eventinfo/delete/{id}")
   public ResponseEntity<Map<String,Boolean>> deleteevent(@PathVariable Long id){
 
    Event event = eventRepo.findById(id).
    orElseThrow(() -> new ResourceNotFoundException("event not existed for id:"+id));

    eventRepo.delete(event);
    Map<String,Boolean> response = new HashMap<>();
    response.put("deleted",Boolean.TRUE);
    return ResponseEntity.ok(response);
  }
  //update the infos
  @PutMapping("/updateEvent/{id}")
  public ResponseEntity<Event> updateevent(@PathVariable long id,@RequestBody Event eventdetails) {
    Event event = eventRepo.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("Event not existed for id:"+id));
    event.setEmail(eventdetails.getEmail());
    event.setPassword(eventdetails.getPassword());
    // user.setName(userdetails.getName());
    Event updatedevent = eventRepo.save(event);
    return ResponseEntity.ok(updatedevent);
   }
}
