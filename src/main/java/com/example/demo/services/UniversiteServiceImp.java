package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Departement;
import com.example.demo.entities.Universite;
import com.example.demo.repository.DepartementRepository;
import com.example.demo.repository.UniversiteRepository;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class UniversiteServiceImp implements UniversiteService{

    UniversiteRepository universiteRepository;
    DepartementRepository departementRepository;

    @Override
    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversite(Long idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(null);
    }

    @Override
    public void assignUniversiteToDepartement(Long idUniv, Long idDepart) {
        Universite univ = universiteRepository.findById(idUniv).orElse(null);
        Departement depart = departementRepository.findById(idDepart).orElse(null);
        univ.getDepartements().add(depart);
        universiteRepository.save(univ);
    }
    
}
