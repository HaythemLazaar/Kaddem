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

import com.example.demo.entities.Equipe;
import com.example.demo.services.EquipeService;

@RestController
@RequestMapping("/api")
public class EquipeController {
    
    @Autowired
    EquipeService EquipeService;

    @GetMapping("/equipe")
    List<Equipe> getAllEquipes(){
        return EquipeService.retrieveAllEquipes();
    }

    @GetMapping("/equipe/{idEquipe}")
    Equipe getEquipe(@PathVariable Long idEquipe){
        return EquipeService.retrieveEquipe(idEquipe);
    }

    @PostMapping("/equipe")
    Equipe addEquipe(@RequestBody Equipe Equipe){
        return EquipeService.addEquipe(Equipe);
    }

    @PutMapping("/equipe")
    Equipe updateEquipe(@RequestBody Equipe Equipe){
        return EquipeService.updateEquipe(Equipe);
    }
    
    
}
