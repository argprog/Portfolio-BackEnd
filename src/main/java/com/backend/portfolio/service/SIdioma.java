
package com.backend.portfolio.service;

import com.backend.portfolio.entity.Idioma;
import com.backend.portfolio.repository.RIdioma;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SIdioma {
    @Autowired
    private RIdioma idiomRepository;
    
    public List <Idioma> getIdioma(){
        List <Idioma> listaIdiomas = idiomRepository.findAll();
        return listaIdiomas;
    }
    
    public void saveIdioma (Idioma idiom){
        idiomRepository.save(idiom);
    }
    
    public void editIdioma (Idioma idiom){
        idiomRepository.save(idiom);
    }
    
    public void deleteIdioma(int id){
        idiomRepository.deleteById(id);
    }
    
    public Idioma findIdioma(int id){
        Idioma idiom = idiomRepository.findById(id).orElse(null);
        return idiom;
    }
}
