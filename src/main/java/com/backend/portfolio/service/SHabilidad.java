
package com.backend.portfolio.service;

import com.backend.portfolio.entity.Habilidad;
import com.backend.portfolio.repository.RHabilidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SHabilidad {
    @Autowired
    private RHabilidad habiRepository;
    
    public List <Habilidad> getHabilidad(){
        List <Habilidad> listaHabilidades = habiRepository.findAll();
        return listaHabilidades;
    }
    
    public void saveHabilidad (Habilidad habi){
        habiRepository.save(habi);
    }
    
    public void editHabilidad (Habilidad habi){
        habiRepository.save(habi);
    }
    
    public void deleteHabilidad(int id){
        habiRepository.deleteById(id);
    }
    
    public Habilidad findHabilidad(int id){
        Habilidad habi = habiRepository.findById(id).orElse(null);
        return habi;
    }
}
