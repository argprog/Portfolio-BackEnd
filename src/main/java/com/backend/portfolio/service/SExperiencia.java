
package com.backend.portfolio.service;

import com.backend.portfolio.entity.Experiencia;
import com.backend.portfolio.repository.RExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SExperiencia {
    @Autowired
    private RExperiencia expeRepository;
    
    public List <Experiencia> getExperiencia(){
        List <Experiencia> listaExperiencias = expeRepository.findAll();
        return listaExperiencias;
    }
    
    public void saveExperiencia (Experiencia expe){
        expeRepository.save(expe);
    }
    
    public void editExperiencia (Experiencia expe){
        expeRepository.save(expe);
    }
    
    public void deleteExperiencia(int id){
        expeRepository.deleteById(id);
    }
    
    public Experiencia findExperiencia(int id){
        Experiencia expe = expeRepository.findById(id).orElse(null);
        return expe;
    }
}
