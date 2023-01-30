package com.backend.portfolio.controller;

import com.backend.portfolio.entity.Proyecto;
import com.backend.portfolio.service.SProyecto;
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
public class CProyecto {
    @Autowired
    private SProyecto proyectoServ;
    
    @GetMapping("/proyectos/traer")
    public List<Proyecto>getProyecto(){
        return proyectoServ.getProyecto();
    }
    
    @GetMapping("/proyectos/traer/{id}")
    @ResponseBody
    public Proyecto getProyecto(@PathVariable int id){
        return proyectoServ.findProyecto(id);
    }
    
    @PostMapping("/proyectos/crear")
    public String createProyecto(@RequestBody Proyecto proye){
        proyectoServ.saveProyecto(proye);
        return "El proyecto fue creado correctamente";
    }
    
    @DeleteMapping("/proyectos/borrar/{id}")
    public String deleteProyecto(@PathVariable int id){
        proyectoServ.deleteProyecto(id);
        return "El proyecto fue eliminado correctamente";
    }

    @PutMapping("/proyectos/editar")
    public String editProyecto(@RequestBody Proyecto proye){
       proyectoServ.editProyecto(proye);
       return "El proyecto se editó correctamente";
    }
}
