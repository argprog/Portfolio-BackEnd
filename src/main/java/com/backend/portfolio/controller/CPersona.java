package com.backend.portfolio.controller;

import com.backend.portfolio.entity.Persona;
import com.backend.portfolio.service.SPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
public class CPersona {
    @Autowired
    private SPersona personaServ;
       
    @GetMapping("/personas/traer")
    public List<Persona>getPersona(){
        return personaServ.getPersona();
    }
    
    @GetMapping("/personas/traer/{id}")
    @ResponseBody
    public Persona getPersona(@PathVariable int id){
        return personaServ.findPersona(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona perso){
        personaServ.savePersona(perso);
        return "La persona fue creada correctamente";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable int id){
        personaServ.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/personas/editar")
    public String editPersona(@RequestBody Persona perso){
       personaServ.editPersona(perso);
       return "ok";
    }
}
