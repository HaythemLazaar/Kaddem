package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Etudiant;
import com.example.demo.services.EtudiantService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class EtudiantController {
    
    EtudiantService etudiantService;

    @GetMapping("/etudiant")
    List<Etudiant> getAllEtudiants(){
        return etudiantService.getAllEtudiants();
    }

    @GetMapping("/etudiant/id/{idEtudiant}")
    Etudiant getEtudiant(@PathVariable Long idEtudiant){
        return etudiantService.getEtudiantById(idEtudiant);
    }

    @PostMapping("/etudiant")
    Etudiant addEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.addEtudiant(etudiant);
    }

    @PutMapping("/etudiant")
    Etudiant updateEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.updateEtudiant(etudiant);
    }
    
    @DeleteMapping("/etudiant/{idEtudiant}")
    void deleteEtudiant(@PathVariable Long idEtudiant){
        etudiantService.deleteEtudiant(idEtudiant);
    }

    @GetMapping("/etudiant/prenom/{prenome}")
    Etudiant getEtudiantByPrenomE(@PathVariable String prenome){
        return etudiantService.getEtudiantByPrenomE(prenome);
    }

    @PutMapping("/etudiant/{idEtudiant}/{idDepart}")
    void assignEtudiantToDepartement(@PathVariable Long idEtudiant, @PathVariable Long idDepart){
        etudiantService.assignEtudiantToDepartement(idEtudiant, idDepart);
    }

    @PostMapping("/etudiant/{idContrat}/{idEquipe}")
    Etudiant addAndAssignEtudiantToEquipeAndContract(
        @RequestBody Etudiant etudiant, 
        @PathVariable("idContrat") Long idContrat, 
        @PathVariable("idEquipe") Long idEquipe){
            return etudiantService.addAndAssignEtudiantToEquipeAndContract(etudiant, idContrat, idEquipe);
        }
}
