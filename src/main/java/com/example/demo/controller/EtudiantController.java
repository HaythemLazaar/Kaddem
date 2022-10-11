package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Etudiant;
import com.example.demo.services.EtudiantService;

@RestController
@RequestMapping("/api")
public class EtudiantController {
    
    @Autowired
    EtudiantService etudiantService;

    @GetMapping("/etudiant")
    List<Etudiant> getAllEtudiants(){
        return etudiantService.getAllEtudiants();
    }

    @PostMapping("/etudiant")
    Etudiant addEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.addEtudiant(etudiant);
    }
    
}
