package com.backend.portfolio.service;

import com.backend.portfolio.entity.User;
import com.backend.portfolio.repository.RUser;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SUser {
    @Autowired
    private RUser userRepository;
    
    public User login(String email, String clave){
        List <User> users=userRepository.findByEmailAndClave(email, clave);
        if (users.isEmpty()){
            return users.get(0);
        }
     return null;
    }
    
     public List <User> getUser(){
        return userRepository.findAll();
    }
    
    public void saveUser (User perso){
        userRepository.save(perso);
    }
    
    public void editUser (User perso){
        userRepository.save(perso);
    }
    
    public void deleteUser(int id){
        userRepository.deleteById(id);
    }
    
    public User findUser(int id){
        User perso = userRepository.findById(id).orElse(null);
        return perso;
    }
}

