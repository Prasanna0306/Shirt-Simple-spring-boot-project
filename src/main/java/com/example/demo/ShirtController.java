package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api/shirts")
public class ShirtController {
    @Autowired
    ShirtService obj;
   
    @PostMapping()
    public ResponseEntity<Shirt> CreateShirt(@RequestBody Shirt s){
        Shirt shirt = obj.saveShirt(s);
        return ResponseEntity.status(HttpStatus.CREATED).body(shirt);
    }
    
    @GetMapping("/getbyid/{id}")
    public ResponseEntity<Optional<Shirt>> getbyId(@PathVariable int id){
       Optional<Shirt> sh = obj.getShirtById(id);
        return ResponseEntity.status(HttpStatus.FOUND).body(sh);
    }
    
    @PutMapping("/path/{id}")
    public ResponseEntity<Shirt> updaShirt(@PathVariable int id , @RequestBody Shirt s){
        Shirt sh = obj.UpdateShirt(s);
        return ResponseEntity.status(HttpStatus.CREATED).body(sh);
    }
}
