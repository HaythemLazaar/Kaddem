package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import com.example.demo.entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, Long>{
    
}