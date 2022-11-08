package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Universite;

public interface UniversiteService {
    List<Universite> retrieveAllUniversites();
    Universite addUniversite (Universite u);
    Universite updateUniversite (Universite u);
    Universite retrieveUniversite (Long idUniversite);
    void assignUniversiteToDepartement(Long idUniv, Long idDepart);
}
