package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/Equipe")
    List<Equipe> Equipes(){
        return EquipeService.retrieveAllEquipes();
    }

    @PostMapping("/Equipe")
    Equipe Equipe(@RequestBody Equipe Equipe){
        return EquipeService.updateEquipe(Equipe);
    }
    
}
