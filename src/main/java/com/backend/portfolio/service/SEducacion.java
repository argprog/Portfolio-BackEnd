package com.backend.portfolio.service;

import com.backend.portfolio.entity.Educacion;
import com.backend.portfolio.repository.REducacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SEducacion {
    @Autowired
    private REducacion eduRepository;
    
    public List <Educacion> getEducacion(){
        List <Educacion> listaEducaciones = eduRepository.findAll();
        return listaEducaciones;
    }
    
    public void saveEducacion (Educacion edu){
        eduRepository.save(edu);
    }
    
    public void editEducacion (Educacion edu){
        eduRepository.save(edu);
    }
    
    public void deleteEducacion(int id){
        eduRepository.deleteById(id);
    }
    
    public Educacion findEducacion(int id){
        Educacion edu = eduRepository.findById(id).orElse(null);
        return edu;
    }
}
