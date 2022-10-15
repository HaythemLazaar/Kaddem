package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Departement;
import com.example.demo.repository.DepartementRepository;

public class DepartementServiceImp implements DepartementService{

    @Autowired
    DepartementRepository departementRepository;

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
    
}
