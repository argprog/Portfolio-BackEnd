
package com.backend.portfolio.repository;

import com.backend.portfolio.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyecto extends JpaRepository<Proyecto,Integer>{
    
}
