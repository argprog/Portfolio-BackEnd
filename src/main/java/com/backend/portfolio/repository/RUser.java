package com.backend.portfolio.repository;

import com.backend.portfolio.entity.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RUser extends JpaRepository<User,Integer> {
    public List <User> findByEmailAndClave(String email, String clave);
}
