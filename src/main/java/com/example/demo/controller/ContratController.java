package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Contrat;
import com.example.demo.services.ContratService;

@RestController
@RequestMapping("/api")
public class ContratController {
    
    @Autowired
    ContratService ContratService;

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
    
}
