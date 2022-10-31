package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import com.example.demo.entities.Equipe;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long>{
    List<Equipe> findByEtudiantsIdEtudiant(Long idEtudiant);
}