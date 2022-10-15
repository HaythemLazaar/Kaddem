package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import com.example.demo.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long>{
    
}