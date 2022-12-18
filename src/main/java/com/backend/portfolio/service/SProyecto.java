
package com.backend.portfolio.service;

import com.backend.portfolio.entity.Proyecto;
import com.backend.portfolio.repository.RProyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SProyecto {
   @Autowired
    private RProyecto proyeRepository;
    
    public List <Proyecto> getProyecto(){
        List <Proyecto> listaProyectos = proyeRepository.findAll();
        return listaProyectos;
    }
    
    public void saveProyecto (Proyecto proye){
        proyeRepository.save(proye);
    }
    
    public void editProyecto (Proyecto proye){
        proyeRepository.save(proye);
    }
    
    public void deleteProyecto(int id){
        proyeRepository.deleteById(id);
    }
    
    public Proyecto findProyecto(int id){
        Proyecto proye = proyeRepository.findById(id).orElse(null);
        return proye;
    } 
}
