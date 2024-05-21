package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

@Service
public class ShirtService {
    @Autowired
    ShirtRepo obj;
    public List<Shirt> getAllShirts(){
        return obj.findAll();
    }

    public Optional<Shirt> getShirtById(int id) {
        return obj.findById(id);
    }

    public Shirt saveShirt(Shirt shirt) {
        return obj.save(shirt);
    }
    @Autowired
    EntityManagerFactory obj2;

    public Shirt UpdateShirt(Shirt sh){
        EntityManager entityManager = obj2.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(sh);
        entityManager.getTransaction().commit();
        entityManager.close();
        return sh;
    }

    public void deleteShirt(int id) {
        obj.deleteById(id);
    }




}
