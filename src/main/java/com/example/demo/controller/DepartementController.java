package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Departement;
import com.example.demo.services.DepartementService;

@RestController
@RequestMapping("/api")
public class DepartementController {
    
    @Autowired
    DepartementService DepartementService;

    @GetMapping("/departement")
    List<Departement> getAllDepartements(){
        return DepartementService.retrieveAllDepartements();
    }

    @GetMapping("/departement/{idDepartement}")
    Departement getDepartement(@PathVariable Long idDepartement){
        return DepartementService.retrieveDepartement(idDepartement);
    }

    @PostMapping("/departement")
    Departement addDepartement(@RequestBody Departement Departement){
        return DepartementService.addDepartement(Departement);
    }

    @PutMapping("/departement")
    Departement updateDepartement(@RequestBody Departement Departement){
        return DepartementService.updateDepartement(Departement);
    }

    @GetMapping("/departement/universite/{idUniv}")
    List<Departement> getDepartementsByUniversite(@PathVariable Long idUniv){
        return DepartementService.retrieveDepartementsByUniversite(idUniv);
    }
    
}
