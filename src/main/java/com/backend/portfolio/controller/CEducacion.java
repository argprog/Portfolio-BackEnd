package com.backend.portfolio.controller;

import com.backend.portfolio.entity.Educacion;
import com.backend.portfolio.service.SEducacion;
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
@CrossOrigin(origins="https://portfolio-frontend-alvarez.web.app")
public class CEducacion {
    @Autowired
    private SEducacion eduServ;
    
    @GetMapping("/educacion/traer")
    public List<Educacion>getEducacion(){
        return eduServ.getEducacion();
    }
    
    @GetMapping("/educacion/traer/{id}")
    @ResponseBody
    public Educacion getEducacion(@PathVariable int id){
        return eduServ.findEducacion(id);
    }
  
    @PostMapping("/educacion/crear")
    public String createEducacion(@RequestBody Educacion edu){
        eduServ.saveEducacion(edu);
        return "La educacion fue creada correctamente";
    }
    
    
    @DeleteMapping("/educacion/borrar/{id}")
    public String deleteEducacion(@PathVariable int id){
        eduServ.deleteEducacion(id);
        return "La educacion fue eliminada correctamente";
    }

 
    @PutMapping("/educacion/editar")
    public String editEducacion(@RequestBody Educacion edu){
       eduServ.editEducacion(edu);
       return "La educacion se editó correctamente";
    }
}
