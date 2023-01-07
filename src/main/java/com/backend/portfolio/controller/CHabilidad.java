package com.backend.portfolio.controller;

import com.backend.portfolio.entity.Habilidad;
import com.backend.portfolio.service.SHabilidad;
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
public class CHabilidad {
    @Autowired
    private SHabilidad habilidadServ;
    
    @GetMapping("/habilidades/traer")
    public List<Habilidad>getHabilidad(){
        return habilidadServ.getHabilidad();
    }
    
    @GetMapping("/habilidades/traer/{id}")
    @ResponseBody
    public Habilidad getHabilidad(@PathVariable int id){
        return habilidadServ.findHabilidad(id);
    }
    
    @PostMapping("/habilidades/crear")
    public String createHabilidad(@RequestBody Habilidad habi){
        habilidadServ.saveHabilidad(habi);
        return "La habilidad fue creada correctamente";
    }
       
    @DeleteMapping("/habilidades/borrar/{id}")
    public String deleteHabilidad(@PathVariable int id){
        habilidadServ.deleteHabilidad(id);
        return "La habilidad fue eliminada correctamente";
    }

    @PutMapping("/habilidades/editar")
    public String editHabilidad(@RequestBody Habilidad habi){
       habilidadServ.editHabilidad(habi);
       return "La habilidad se editó correctamente";
    }
}
