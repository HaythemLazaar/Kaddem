package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import com.example.demo.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Long>{
    
}
