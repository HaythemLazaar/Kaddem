package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import com.example.demo.entities.DetailEquipe;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DetailEquipeRepository extends JpaRepository<DetailEquipe, Long>{
    List<DetailEquipe> findByThematiqueLike(String thematique);
}