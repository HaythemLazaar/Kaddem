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

    @GetMapping("/Departement")
    List<Departement> getAllDepartements(){
        return DepartementService.retrieveAllDepartements();
    }

    @GetMapping("/Departement/{idDepartement}")
    Departement getDepartement(@PathVariable Long idDepartement){
        return DepartementService.retrieveDepartement(idDepartement);
    }

    @PostMapping("/Departement")
    Departement addDepartement(@RequestBody Departement Departement){
        return DepartementService.addDepartement(Departement);
    }

    @PutMapping("/Departement")
    Departement updateDepartement(@RequestBody Departement Departement){
        return DepartementService.updateDepartement(Departement);
    }
    
}
