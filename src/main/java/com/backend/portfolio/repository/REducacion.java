package com.backend.portfolio.repository;

import com.backend.portfolio.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository<Educacion,Integer>{
    
}
