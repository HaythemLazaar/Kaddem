package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Departement;

public interface DepartementService {
    List<Departement> retrieveAllDepartements();
    Departement addDepartement (Departement d);
    Departement updateDepartement (Departement d);
    Departement retrieveDepartement (Long idDepart);
}
