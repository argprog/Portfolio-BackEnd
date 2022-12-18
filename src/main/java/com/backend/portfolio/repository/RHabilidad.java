
package com.backend.portfolio.repository;

import com.backend.portfolio.entity.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHabilidad extends JpaRepository<Habilidad,Integer>{
    
}
