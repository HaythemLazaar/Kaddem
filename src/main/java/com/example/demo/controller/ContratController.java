package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Contrat;
import com.example.demo.entities.Etudiant;
import com.example.demo.services.ContratService;
import com.example.demo.services.EtudiantService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ContratController {
    
    ContratService ContratService;
    EtudiantService etudiantService;

    @GetMapping("/contrat")
    List<Contrat> getAllContrats(){
        return ContratService.retrieveAllContrats();
    }

    @GetMapping("/contrat/{idContrat}")
    Contrat getContrat(@PathVariable Long idContrat){
        return ContratService.retrieveContrat(idContrat);
    }

    @PostMapping("/contrat")
    Contrat addContrat(@RequestBody Contrat Contrat){
        return ContratService.addContrat(Contrat);
    }

    @PutMapping("/contrat")
    Contrat updateContrat(@RequestBody Contrat Contrat){
        return ContratService.updateContrat(Contrat);
    }
    
    @DeleteMapping("/contrat/{idContrat}")
    void deleteContrat(@PathVariable Long idContrat){
        ContratService.removeContrat(idContrat);
    }

    @PutMapping("/contrat/{idContrat}/{idEtudiant}")
    Contrat aasignContratToEtudiant(
        @PathVariable("idContrat") Long idContrat, 
        @PathVariable("idEtudiant") Long idEtudiant){
            Contrat ce = ContratService.retrieveContrat(idContrat);
            Etudiant etudiant = etudiantService.getEtudiantById(idEtudiant);
            return ContratService.affectContratToEtudiant(ce, etudiant.getNomE(), etudiant.getPrenomE());
        }
    
    @GetMapping("/contrat/chiffre-affaire")
    float getChiffreAffaireEntreDeuxDate(
        @RequestParam(name = "start-date") @DateTimeFormat(pattern = "dd.MM.yyyy") Date startDate, 
        @RequestParam(name = "end-date") @DateTimeFormat(pattern = "dd.MM.yyyy") Date endDate){
            return ContratService.getChiffreAffaireEntreDeuxDate(startDate, endDate);
        }

    @GetMapping("/contrat/valide")
    Integer nbContratsValides(
        @RequestParam(name = "start-date") @DateTimeFormat(pattern = "dd.MM.yyyy") Date startDate, 
        @RequestParam(name = "end-date") @DateTimeFormat(pattern = "dd.MM.yyyy") Date endDate){
            return ContratService.nbContratsValides(startDate, endDate);
        }
}
