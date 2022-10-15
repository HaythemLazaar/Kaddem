package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import com.example.demo.entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ContratRepository extends JpaRepository<Contrat, Long>{
    
}