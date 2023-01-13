package com.backend.portfolio.service;

import com.backend.portfolio.entity.Persona;
import com.backend.portfolio.repository.RPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SPersona {
    @Autowired
    private RPersona persoRepository;
        
    public List <Persona> getPersona(){
        return persoRepository.findAll();
    }
    
    public void savePersona (Persona perso){
        persoRepository.save(perso);
    }
    
    public void editPersona (Persona perso){
        persoRepository.save(perso);
    }
    
    public void deletePersona(int id){
        persoRepository.deleteById(id);
    }
    
    public Persona findPersona(int id){
        Persona perso = persoRepository.findById(id).orElse(null);
        return perso;
    }
}
