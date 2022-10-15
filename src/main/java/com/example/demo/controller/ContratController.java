package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    List<Contrat> Contrats(){
        return ContratService.retrieveAllContrats();
    }

    @PostMapping("/contrat")
    Contrat Contrat(@RequestBody Contrat Contrat){
        return ContratService.updateContrat(Contrat);
    }
    
}
