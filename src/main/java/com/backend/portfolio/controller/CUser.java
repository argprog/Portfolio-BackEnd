package com.backend.portfolio.controller;

import com.backend.portfolio.entity.User;
import com.backend.portfolio.service.SUser;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class CUser {
    @Autowired
    private SUser userServ;
   
    @PostMapping("/login")
    public User login (@RequestBody User user){
    return userServ.login(user.getEmail(),user.getClave());
    }
    
    @GetMapping("/user/traer")
    public List<User>getUser(){
        return userServ.getUser();
    }
    
    @GetMapping("/user/traer/{id}")
    @ResponseBody
    public User getUser(@PathVariable int id){
        return userServ.findUser(id);
    }
    
    @PostMapping("/user/crear")
    public String createUser(@RequestBody User user){
        userServ.saveUser(user);
        return "El usuario fue creado correctamente";
    }
       
    @DeleteMapping("/user/borrar/{id}")
    public String deleteUser(@PathVariable int id){
        userServ.deleteUser(id);
        return "El usuario fue eliminado correctamente";
    }

    @PutMapping("/user/editar")
    public String editUser(@RequestBody User user){
       userServ.editUser(user);
       return "ok";
    }
}


