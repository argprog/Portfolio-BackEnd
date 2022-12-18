package com.backend.portfolio.controller;

import com.backend.portfolio.entity.Idioma;
import com.backend.portfolio.service.SIdioma;
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
public class CIdioma {
    @Autowired
    private SIdioma idiomaServ;
    
    @GetMapping("/idiomas/traer")
    public List<Idioma>getIdioma(){
        return idiomaServ.getIdioma();
    }
    
    @GetMapping("/idiomas/traer/{id}")
    @ResponseBody
    public Idioma getIdioma(@PathVariable int id){
        return idiomaServ.findIdioma(id);
    }
    
    @PostMapping("/idiomas/crear")
    public String createIdioma(@RequestBody Idioma idiom){
        idiomaServ.saveIdioma(idiom);
        return "El idioma fue creado correctamente";
    }
       
    @DeleteMapping("/idiomas/borrar/{id}")
    public String deleteIdioma(@PathVariable int id){
        idiomaServ.deleteIdioma(id);
        return "El idioma fue eliminado correctamente";
    }

    @PutMapping("/idiomas/editar/{id}")
    public String editIdioma(@RequestBody Idioma idiom){
       idiomaServ.editIdioma(idiom);
       return "El idioma se editó correctamente";
    }
}
