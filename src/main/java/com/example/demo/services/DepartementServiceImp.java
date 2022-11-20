package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Departement;
import com.example.demo.entities.Universite;
import com.example.demo.repository.DepartementRepository;
import com.example.demo.repository.UniversiteRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartementServiceImp implements DepartementService{

    DepartementRepository departementRepository;
    UniversiteRepository universiteRepository;

    @Override
    public List<Departement> retrieveAllDepartements() {
        return departementRepository.findAll();
    }

    @Override
    public Departement addDepartement(Departement d) {
        return departementRepository.save(d);
    }

    @Override
    public Departement updateDepartement(Departement d) {
        return departementRepository.save(d);
    }

    @Override
    public Departement retrieveDepartement(Long idDepart) {
        return departementRepository.findById(idDepart).orElse(null);
    }

    @Override
    public List<Departement> retrieveDepartementsByUniversite(Long idUniversite){
        Universite univ = universiteRepository.findById(idUniversite).orElse(null);
        return new ArrayList<Departement>(univ.getDepartements());
    }
    
}
