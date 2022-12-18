
package com.backend.portfolio.repository;

import com.backend.portfolio.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia,Integer> {
    
}
