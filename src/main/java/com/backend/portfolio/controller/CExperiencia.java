package com.backend.portfolio.controller;

import com.backend.portfolio.entity.Experiencia;
import com.backend.portfolio.service.SExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CExperiencia {
    @Autowired
    private SExperiencia expeServ;
    
    @GetMapping("/experiencias/traer")
    public List<Experiencia>getExperiencia(){
        return expeServ.getExperiencia();
    }
    
    @GetMapping("/experiencias/traer/{id}")
    @ResponseBody
    public Experiencia getExperiencia(@PathVariable int id){
        return expeServ.findExperiencia(id);
    }
    
    @PostMapping("/experiencias/crear")
    public String createExperiencia(@RequestBody Experiencia expe){
        expeServ.saveExperiencia(expe);
        return "La experiencia fue creada correctamente";
    }
       
    @DeleteMapping("/experiencias/borrar/{id}")
    public String deleteExperiencia(@PathVariable int id){
        expeServ.deleteExperiencia(id);
        return "La experiencia fue eliminada correctamente";
    }

    @PutMapping("/experiencias/editar/{id}")
    public String editExperiencia(@RequestBody Experiencia expe){
       expeServ.editExperiencia(expe);
       return "La experiencia se editó correctamente";
    }
}
