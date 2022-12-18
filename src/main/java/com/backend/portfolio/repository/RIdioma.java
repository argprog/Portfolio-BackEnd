
package com.backend.portfolio.repository;

import com.backend.portfolio.entity.Idioma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RIdioma extends JpaRepository<Idioma,Integer>{
    
}
